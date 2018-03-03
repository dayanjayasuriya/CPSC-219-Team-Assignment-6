/** This class works as a part of the BankAccount class.
* The ChequingAccount allows for overDrafts to occur and charges a
* fee for them.
* This version is made by Dayan Jayasuriya, Nicki Lindstrom,
* and Riley Schaaf.
* Used for Assignment 6
* Last updated 28/FEB/2018 18:49 by Dayan
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
    overdraftAmount = amount;
  }

  /**
  * Withdraw method that overrides the withdraw method in BankAccount
  * Allows for negative withdrawls
  */
  @Override
  public void withdraw(double amountWidthdraw) {
    double currentFee = 0;
    double minimumBalance = 0;
    double currentBalance = getBalance();
    super.withdraw(amountWidthdraw);
    double newBalance = getBalance();
    if ((currentBalance == newBalance)) {
      if ((currentBalance - amountWidthdraw) >= getOverdraftAmount()){
        setBalance(currentBalance - (amountWidthdraw + getTransactionFee()));
      }
    }
  }
}
