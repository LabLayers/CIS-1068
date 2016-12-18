public class Vehicle 
{
    //instance variables
    private double hourRange;
    private double capacity; //in cubic feet
    
    //constructors
    public Vehicle()
    {
        hourRange = 0.0;
        capacity = 0.0;
    }
    
    public Vehicle(double hr, double c)
    {
        hourRange = hr;
        capacity = c;
    }
    
    //getters and setters
    public double getHourRange()
    {
        return hourRange;
    }
    
    public void setHourRange(double hourRange)
    {
        this.hourRange = hourRange;
    }
    
    public double getCapacity()
    {
        return capacity;
    }
    
    public void setCapacity(double capacity)
    {
        this.capacity = capacity;
    }
    
    //common methods
    public String toString()
    {
        return "Vehicle with capacity of " + capacity + " cubic feet and range of " + hourRange + " per hour. "
    }
    public boolean equals(Vehicle other)
    {
        return (this.capacity==other.capacity && this.hourRange==other.hourRange);
    }
    
    
}