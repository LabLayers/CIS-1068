/**
 * Station B
 * @author Victor Lourng
 * @author Dan Burger
 * @version	2016
 */
import java.util.Calendar;

public class StationB extends Station {

  private static final Item[] items = {new Item("Bread",1.50),new Item("Milk",2.25),new Item("Candy bar",1.10),new Item("Potato chips",1.25),new Item("Sandwich",3.75)};

  public StationB(){
    super(items);
  }
  
  public String getGasPrice() {
    return new String("The gas price is: 2.50 per gallon on MONDAY, WEDNESDAY, FRIDAY. The gas price is: 3.50 on all other days.");
  }
  public double calculateGasPrice(double gallons) {
    double gp;
    Calendar calendar = Calendar.getInstance();
    int day = calendar.get(Calendar.DAY_OF_WEEK); 

    switch (day) {
      case Calendar.MONDAY:
      case Calendar.WEDNESDAY:
      case Calendar.FRIDAY:
        return 2.50*gallons;
      default:
        return 3.50*gallons;
    }
  }
  
}