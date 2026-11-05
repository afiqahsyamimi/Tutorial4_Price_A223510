public class Product implements Price
{
    // Private instance variables
    protected String type;
    protected boolean buy;

    // Constructor
    public Product(String type)
    {
        this.type = type;
    }

    // Getter method
    public String getType()
    {
        return type;
    }

    // Override method from Price interface
    public void getPrice(Customer c)
    {
        if(c.getSalary() > 4000)
        {
            System.out.println("The customer's name is "+ c.getName()+ " with salary RM" + c.getSalary() + " can buy this product.");

            System.out.println("Your salary is higher than the price's product.");
        }
        else
        {
            System.out.println("The customer's name is " + c.getName() + " with salary RM" + c.getSalary() + " cannot buy this product.");

            System.out.println("The product price is more than your salary.");
        }
    }

    // toString method
    public String toString()
    {
        return "Type: " + type;
    }
}

//References: Copilot