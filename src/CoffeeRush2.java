public class CoffeeRush2
{
    public static void main(String[] args)
    {
        int numberOfCustomers = 24;
        int numberOfCups = 22;
        int num = 0;

        while(numberOfCustomers > 0 && numberOfCups > 0)
        {
            num++;
            System.out.println("Making coffee order #" + num);
            System.out.println(" 1. Grab a collectible cup");
            System.out.println(" 2. Fill cup with regular coffee, " +
                    "leaving room for cream or sugar");
            System.out.println(" 3. Place medium to-go lid securely on top");
            System.out.println(" 4. Insert a coffee stirrer through the " +
                    "hole on the top of the lid");
            if (num % 2 == 0)
            System.out.println(" 5. Place the drink on the LEFT counter - " +
                    "\"Order Ready!\"");
            else
                System.out.println(" 5. Place the drink on the RIGHT counter - " +
                                        "\"Order Ready!\"");

            System.out.println("Order #" + num + " complete!");
            System.out.println("");

            numberOfCustomers--;
            numberOfCups--;
        }
        if (numberOfCups == 0)
            System.out.println("Sorry! No more cups!");
        else
            System.out.println("Whew! No more customers!");
    }
}
