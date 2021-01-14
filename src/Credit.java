/**
* Class representing a credit for a discount on a ticket purchase. An instance of
* this class is created when a customer cancels their ticket.
* @author Michael Vassilev, Minh Vo, Matthew Wells, Junhao Xue
*/
public class Credit{
  private int id;
  private double value;

  /**
  * Constructor that takes the ID number and value of a new credit to be created,
  * and sets them to the relavent variables.
  */
  public Credit(int theID, double theValue){
    id = theID;
    value = theValue;
    
  }

  public double getValue(){
    return value;
  }

  public int getID(){
    return id;
  }
}