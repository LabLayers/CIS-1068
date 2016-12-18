/**
 * Item
 * @author Victor Lourng
 * @author Dan Burger
 * @version	2016
 */
 
 // An item class was created for future flexibility;

public class Item {
  private String name;
  private double price;
  
  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }
  
  public void setName(String n) {
    this.name = n;
  }
  public String getName() {
    return this.name;
  }
  
  public void setPrice(double p) {
    this.price = p;
  }
  // by default 1
  public double getPrice() {
    return this.price;
  }
  // quantity: you can't exactly buy half a candy bar
  public double getPrice(int quantity) {
    return this.price*quantity;
  }
  
  public String toString() {
    return new String("Item " + this.name + " price is: " + this.price);
  }
  public boolean equals(Item that) {
    return this.price==that.price&&this.name==that.name;
  }
}