public class Laptop extends Product
{
    // Private instance variables
    private String nameL;
    private double priceL;

    // Constructor
    public Laptop(String type,
                  String nameL,
                  double priceL)
    {
        super(type);
        this.nameL = nameL;
        this.priceL = priceL;
    }

    // Override toString method
    public String toString()
    {
        return "The product is " + nameL + ".";
    }
}

//References: Copilot