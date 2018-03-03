/** This class works as a part of the BankAccount class.
* The ChequingAccount allows for overDrafts to occur and charges a
* fee for them.
* This version is made by Dayan Jayasuriya, Nicki Lindstrom,
* and Riley Schaaf.
* Used for Assignment 6
* Last updated 02/Feb/2018 21:15 by Riley
*/
public class ChequingAccount extends BankAccount {
  private double transactionFee;
  private double overdraftAmount;

  /**
  * Constructors
  */

  public ChequingAccount(double newTransactionFee) {
    setTransactionFee(newTransactionFee);
  }
  public ChequingAccount(Customer accountHolder, double startBalance,
                          double newTransactionFee) {
    setBalance(startBalance);
    setCustomer(accountHolder);
    setTransactionFee(newTransactionFee);
  }

  /**
  * Getter methods
  */
  public double getTransactionFee() {
    return transactionFee;
  }
  public double getOverdraftAmount() {
    return overdraftAmount;
  }

  /**
  * Setter Methods
  */
  public void setTransactionFee(double fee) {
    transactionFee = fee;
  }
  public void setOverdraftAmount(double amount) {
    overdraftAmount = -amount;
  }

  /**
  * Withdraw method that overrides the withdraw method in BankAccount
  * Allows for negative withdrawls
  */
  public void withdraw(double amountwithdraw) {

    double currentBalance = getBalance();
    //if after withdrawl the balance is above 0, go ahead and withdraw the money
    if ((currentBalance - amountwithdraw) >=0.0) {
        setBalance(currentBalance - amountwithdraw);
      }
    /* if after withdrawl the balance is below 0, check the balance does not violate
    the overdraft amount. If it does not, allow the withdrawl and impose the
    fee*/
    else if ((currentBalance - amountwithdraw) >= getOverdraftAmount()){
        setBalance(currentBalance - (amountwithdraw + getTransactionFee()));
      }
  }
}
