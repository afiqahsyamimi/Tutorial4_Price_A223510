public class Customer
{
    // Private instance variables
    private String nameCust;
    private double salary;

    // Constructor
    public Customer(String nameCust, double salary)
    {
        this.nameCust = nameCust;
        this.salary = salary;
    }

    // Getter for customer's name
    public String getName()
    {
        return nameCust;
    }

    // Getter for customer's salary
    public double getSalary()
    {
        return salary;
    }
}