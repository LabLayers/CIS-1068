/**
 * Car
 * @author Victor Lourng
 * @version	2016
 */

public class Car {
  public User owner;
  public String make;
  public String model;
  public int year;
  public String color;
  public String plate;
  
  public String toString() {
    return GetCarInfo();
  }
  public String GetCarInfo() {
    return this.year+" "+"color"+" "+this.make+" "+this.model+"\nPlate: "+this.plate;
  }
  public String GetPlate() {
    return this.plate;
  }
  public String GetOwner() {
    return owner.GetName();
  }
  public void SetOwner(User newOwner) {
    this.owner = newOwner;
  }
  public boolean equals(Car that) {
    return this.make == that.make && 
      this.model == that.model && 
      this.year == that.year && 
      this.color == that.color && 
      this.plate == that.plate;
  }
  
  public Car(User owner, String make, String model, int year, String color, String plate) {
    this.owner = owner;
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    this.plate = plate;
  }
}