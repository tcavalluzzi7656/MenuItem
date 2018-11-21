public class MenuRunner {

    public static void main(String[] args)
    {
        sandwich reuben = new sandwich(5.75,"Reuben");
        sandwich bec = new sandwich(2.00,"BEC");
        salad waldorf = new salad(7.25, "Waldorf");
        salad caeser = new salad (4.50, "Ceaser");
        drink icedTea = new drink(1.50,"Iced Tea");
        drink smoothie = new drink(5.50, "Smoothie");

        trio trio1 = new trio(reuben, waldorf, icedTea);
        trio trio2 = new trio(bec,caeser,smoothie);
        trio trio3 = new trio(bec,caeser,icedTea);

        System.out.println(trio1.getName()+" Price: "+trio1.getPrice());
        System.out.println(trio2.getName()+" Price: "+trio2.getPrice());
        System.out.println(trio3.getName()+" Price: "+trio3.getPrice());
    }
}
