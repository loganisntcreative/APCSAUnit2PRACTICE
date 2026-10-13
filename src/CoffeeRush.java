public class CoffeeRush
{
    public static void main(String[] args)
    {
        int numberOfCustomers = 45;

        for (int c = 1; c <= numberOfCustomers; c++) {
            System.out.println("Making coffee order #" + c);
            System.out.println(" 1. Grab a collectible cup");
            System.out.println(" 2. Fill cup with regular coffee, " +
                    "leaving room for cream or sugar");
            System.out.println(" 3. Place medium to-go lid securely on top");
            System.out.println(" 4. Insert a coffee stirrer through the " +
                    "hole on the top of the lid");
            System.out.println(" 5. Place the drink on the counter - " +
                    "\"Order Ready!\"");

            System.out.println("Order #" + c + " complete!");
            System.out.println("");
        }
    }
}
