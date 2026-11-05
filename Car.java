public class Car implements Price
{
    // Private instance variables
    private String brand;
    private double priceCar;
    private boolean buy;

    // Constructor
    public Car(String brand, double priceCar)
    {
        this.brand = brand;
        this.priceCar = priceCar;
    }

    // Getter method
    public String getBrand()
    {
        return brand;
    }

    // Override method from Price interface
    public void getPrice(Customer c)
    {
        if(c.getSalary() > 8000)
        {
            System.out.println("The customer's name is " + c.getName() + " with salary RM"+ c.getSalary() + " can buy this car. Your salary is higher than the price's car.");
        }
        else
        {
            System.out.println("The customer's name is " + c.getName() + " with salary RM" + c.getSalary() + " cannot buy this car.");
        }
    }

    // toString method
    public String toString()
    {
        return "The car brand is " + brand + " with price RM" + priceCar + ".";
    }
}

//References: Copilot