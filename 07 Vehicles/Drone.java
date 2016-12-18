public class Drone extends Vehicle
{
    //drone specific instance variables
    private String flyer;
    private int wings;
    private int battery_time;
    private int charging_time;

    //drone's own constructors
    public Drone()
    {
        super();  //can be left out, will still happen
        flyer = "No name yet";
        wings = 4; // quadcopter
    }
    
    public Drone(double hourRange, double capacity, String flyer, int battery_time, int charging_time)
    {
        super(hourRange, capacity);
        this.flyer = flyer;
        this.battery_time = battery_time;
        this.charging_time = charging_time;
    }
    
    //drone's own getters and setters
    public String getflyer()
    {
        return flyer;
    }
    
    public void setflyer(String op)
    {
        flyer = op;
    }
    
       public int getBatteryTime()
    {
        return battery_time;
    }
    
    public void setChargingTime(int x)
    {
        charging_time = x;
    }
    
   public int getChargingTime()
    {
        return charging_time;
    }
    
    public void setBatteryTime(int x)
    {
        battery_time = x;
    }
    //drone's own common methods
    public String toString()
    {
        return (super.toString() + "Flyer is " + flyer + ". "+ "Drone has " + wings + " wings. "+ "Charging time is " + charging_time + " mins. "+ "Flying time is " + battery_time + " mins. ");
    }
    public boolean equals(Drone other)
    {
        return (super.equals((Vehicle)other)&&this.flyer==other.flyer&&this.wings==other.wings&&this.charging_time==other.charging_time&&this.battery_time==other.battery_time);
    }
}