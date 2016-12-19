/**
 * Station C
 * @author Victor Lourng
 * @author Dan Burger
 * @version	2016
 */

public class StationC extends Station {
  
  private static final Item[] items = {new Item("Bread",1.75),new Item("Milk",1.95),new Item("Candy bar",1.00),new Item("Potato chips",1.20),new Item("Sandwich",4.00)};

  public StationC(){
    super(items);
  }
  
  public String getGasPrice() {
    return new String("The gas price is: 1.00 for the first five gallons, then 3.00 for every subsequent gallon.");
  }
  public double calculateGasPrice(double gallons) {
    double price = 0.0;
    if (gallons > 5) {
      price += 5.0;
      gallons -= 5.0;
      price = price + (gallons * 3.0);
    } else {
      price = (gallons * 1.0);
    }
    return price;
  }
  
}