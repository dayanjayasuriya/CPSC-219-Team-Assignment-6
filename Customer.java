/**
* Team #5 Assignment 3
* Rough Draft by Dayan Jayasuriya, Nicki Lindstrom and Riley Schaaf
* Last updated 7/FEB/2018 09:32 by Nicki.
*
*
* Class Representing a customer
*/
public class Customer {
  private String name;
  private int id;


  /**
  * Constructor for name and ID input
  */
  public Customer(String name, int id) {
      setName(name);
      setID(id);
  }


  /**
  * Copy constructor for the Customer class.
  */
  public Customer (Customer oldCustomer){
    setName(oldCustomer.getName());
    setID(oldCustomer.getID());
  }

  /**
  * Setter and Getter methods for name
  */
  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  /**
  * Setter and Getter methods for customerID
  */
  public int getID() {
    return id;
  }

  public void setID(int newCustomerID) {
    id = newCustomerID;
  }

  /**
  * Convert instance variables to a combined string
  */
  public String toString() {
    String varString = ("Customer name: " + name + "; "
                      + "Customer ID: " + id);
    return varString;
  }
}
