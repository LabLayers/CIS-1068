/**
 * Main
 * @author Victor Lourng
 * @author Dan Burger
 * @version	2016
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        
    Station StationA = new StationA();
    System.out.println("Gas Price of Station A: " + StationA.getGasPrice());
    System.out.println("Gas Price of Station A at 6 gallons: " + StationA.calculateGasPrice(6.0));
    System.out.println("Item prices at Station A: " + StationA.getItemPrices());
    System.out.println("Price of 2 Bread at Station A: " + StationA.calculateItemPrice("Bread",2));
    System.out.println("Price of 3 Milk and 1 Candy bar at Station A: " + (StationA.calculateItemPrice("milk",3)+StationA.calculateItemPrice("CANDY BAR",1)));

        
    Station StationB = new StationB();
    System.out.println("Gas Price of Station B: " + StationB.getGasPrice());
    System.out.println("Gas Price of Station B at 6 gallons: " + StationB.calculateGasPrice(6.0));
    System.out.println("Item prices at Station B: " + StationB.getItemPrices());
    System.out.println("Price of 2 Bread at Station B: " + StationB.calculateItemPrice("Bread",2));
    System.out.println("Price of 3 Milk and 1 Candy bar at Station B: " + (StationB.calculateItemPrice("milk",3)+StationB.calculateItemPrice("CANDY BAR",1)));
        
    Station StationC = new StationC();
    System.out.println("Gas Price of Station C: " + StationC.getGasPrice());
    System.out.println("Gas Price of Station C at 6 gallons: " + StationC.calculateGasPrice(6.0));
    System.out.println("Item prices at Station C: " + StationC.getItemPrices());
    System.out.println("Price of 2 Bread at Station C: " + StationC.calculateItemPrice("Bread",2));
    System.out.println("Price of 3 Milk and 1 Candy bar at Station C: " + (StationC.calculateItemPrice("milk",3)+StationC.calculateItemPrice("CANDY BAR",1)));

    

  }
}