public class Bike extends Vehicle
{
    //bikes specific instance variables
    private String operator;
    
    //bike's own constructors
    public Bike()
    {
        super();  //can be left out, will still happen
        operator = "No name yet";
    }
    
    public Bike(double hourRange, double capacity, String operator)
    {
        super(hourRange, capacity);
        this.operator = operator;
    }
    
    //bike's own getters and setters
    public String getOperator()
    {
        return operator;
    }
    
    public void setOperator(String op)
    {
        operator = op;
    }
    
    //bike's own common methods
    public String toString()
    {
        return (super.toString() + "Courier is " + operator + ". ");
    }
    public boolean equals(Bike other)
    {
        return (super.equals((Vehicle)other)&&this.operator==other.operator);
    }
}