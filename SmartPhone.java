public class SmartPhone extends Product
{
    // Private instance variables
    private String nameSP;
    private double priceSP;

    // Constructor
    public SmartPhone(String type, String nameSP, double priceSP)
    {
        super(type);
        this.nameSP = nameSP;
        this.priceSP = priceSP;
    }

    // Override toString method
    public String toString()
    {
        return "The product is " + nameSP + ".";
    }
}

//References: Copilot
