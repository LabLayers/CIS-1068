public class Plane extends Vehicle
{
    //plane specific instance variables
    private String brand;
    private String maintence_facility;
    private double fuel_max;
    private double average_mpg;

    //plane's own constructors
    public Plane()
    {
        super();  //can be left out, will still happen
        brand = "No name yet";
    }
    
    public Plane(double hourRange, double capacity, String brand, String maintence_facility, double fuel_max, double average_mpg)
    {
        super(hourRange, capacity);
        this.brand = brand;
        this.maintence_facility = maintence_facility;
        this.fuel_max = fuel_max;
        this.average_mpg = average_mpg;
    }
    
    //plane's own getters and setters
    public String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String op)
    {
        brand = op;
    }
    
    public String getMaintFacility()
    {
        return maintence_facility;
    }
    
    public void setMaintFacility(String ma)
    {
        maintence_facility = ma;
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
    
    
    //plane's own common methods
    public String toString()
    {
        return (super.toString() + "Brand is " + brand + ". "+ "Maint Facility is in " + maintence_facility + ". "+ "Avg MPG is " + average_mpg + "miles per gallon. "+ "Fuel Capacity is " + fuel_max + " gallons. ");
    }
    public boolean equals(Plane other)
    {
        return (super.equals((Vehicle)other)this.fuel_max==other.fuel_max&&this.maintence_facility==other.maintence_facility&&this.average_mpg==other.average_mpg);
    }
}