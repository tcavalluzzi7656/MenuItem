public class drink implements MenuItem {
    private double price;
    private String name;

    public drink(double price,String name)
    {
        this.price=price;
        this.name=name;
    }

    public double getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }


}
