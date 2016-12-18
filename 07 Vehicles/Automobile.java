public class Automobile extends Vehicle
{
    //automobiles specific instance variables
    private String driver;
    private int axles;
    private double fuel_max;
    private double average_mpg;
    
    //automobile's own constructors
    public Automobile()
    {
        super();  //can be left out, will still happen
        driver = "No name yet";
        axles = 2;
    }
    
    public Automobile(double hourRange, double capacity, String driver, int axles, double fuel_max, double average_mpg)
    {
        super(hourRange, capacity);
        this.driver = driver;
        this.axles = axles;
        this.fuel_max = fuel_max;
        this.average_mpg = average_mpg;
    }
    
    //automobile's own getters and setters
    public String getDriver()
    {
        return driver;
    }
    
    public void setDriver(String op)
    {
        driver = op;
    }
    
    public int getAxles()
    {
        return axles;
    }
    
    public void setAxles(int ax)
    {
        axles = ax;
    }
    
    
    public double getAvgMpg()
    {
        return average_mpg;
    }
    
    public void setAvgMpg(double av)
    {
        average_mpg = av;
    }
    
    public double getFuelMax()
    {
        return fuel_max;
    }
    
    public void setFuelMax(double fu)
    {
        fuel_max = fu;
    }
    
    
    
    //automobile's own common methods
    public String toString()
    {
        return (super.toString() + "Courier is " + operator + ". " + "Avg MPG is " + average_mpg + "miles per gallon. "+ "Fuel Capacity is " + fuel_max + " gallons. ");
    }
    public boolean equals(Automobile other)
    {
        return (super.equals((Vehicle)other)&&this.driver==other.driver&&this.fuel_max==other.fuel_max&&this.axles==other.axles&&this.average_mpg==other.average_mpg);
    }
}