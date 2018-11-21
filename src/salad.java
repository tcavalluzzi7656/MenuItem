public class salad implements MenuItem {
    private double price;
    private String name;

    public salad(double price,String name)
    {
        this.price=price;
        this.name=name;
    }



    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}


