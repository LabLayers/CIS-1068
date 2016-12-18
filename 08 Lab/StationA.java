/**
 * Station A
 * @author Victor Lourng
 * @author Dan Burger
 * @version	2016
 */
 
public class StationA extends Station {
  private static final Item[] items = {new Item("Bread",1.80),new Item("Milk",2.00),new Item("Candy bar",1.00),new Item("Potato chips",1.35),new Item("Sandwich",3.50)};

  public StationA(){
    super(3.00, items);
  }
  
}