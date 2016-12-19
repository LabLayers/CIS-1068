/**
 * Station (with Store)
 * @author Victor Lourng
 * @author Dan Burger
 * @version	2016
 */

public class Station {
  private double GasPrice;
  private Item[] items = new Item[5];

  public Station(){
  }
  public Station(double GasPrice){
    this.GasPrice = GasPrice;
  }
  public Station(Item[] items){
    this.items = items;
  }
  public Station(double GasPrice, Item[] items){
    this.GasPrice = GasPrice;
    this.items = items;
  }
  
  // by default gas station has one fixed price, can be overloaded for special rules and this would not be applicable.
  public void setGasPrice(double price) {
    this.GasPrice = price;
  }
  // Each gas station has its own rules, so it returns a string explaining pricing rules.
  public String getGasPrice() {
    return new String("The gas price is: " + this.GasPrice +" per gallon.");
  }
  public double calculateGasPrice(double gallons) {
    return GasPrice*gallons;
  }
  
  // public String testA() {
  //   return items[1].getName();
  // }
  
  public String getItemPrices() {
    String s = "";  
		for (Item x : this.items) {
			s += x.getName() + " costs " + x.getPrice() + "; ";
		}
		return s;
  }
  
  public double calculateItemPrice(String item, int quantity) {
		for (Item x : this.items) {
			if (x.getName().toLowerCase().equals(item.toLowerCase())) {
				return quantity*x.getPrice();
			}
		}
		return 0.00;
  }
  
  public String toString() {
    return new String("String goes here");
  }
  public boolean equals(Station that) {
    return this.GasPrice==that.GasPrice;
  }

}