public class DrinkOrder
{
    public static void main(String[] args)
    {
        // Order details
        String size = "medium"; // small, medium, or large. MUST be set
        String milkType = "oat"; // almond, oat, etc.
        boolean extraHot = true; // boolean for extra hot temperature

        // Variables for drink making instructions
        String milkCarton = "";
        int steamTemperature = 0;
        String mugType = "";
        String plateType = "";

        // Add decisions here to evaluate the order details and determine
        // what the instructions need to be

        // Determine milk carton
        if (milkType.equals("almond"))
        {
            milkCarton = "almond milk carton";
        }
        else if (milkType.equals("oat"))
        {
            milkCarton = "oat milk carton";
        }
        else
        {
            milkCarton = "regular milk carton";
        }

        // Determine mug size
        if (size.equals("medium"))
        {
            mugType = "regular mug";
            plateType = "small plate";
        }
        else if (size.equals("small"))
        {
            mugType = "small mug";
            plateType = "saucer";
        }
        else if (size.equals("large"))
        {
            mugType = "tall mug";
            plateType = "large plate";
        }

        // steam temperature in degrees
        if (extraHot)
        {
            steamTemperature = 170; // extra hot temp
        }
        else
        {
            steamTemperature = 150; // default regular temp
        }

        // Adjust if oat milk and extra hot
        if (extraHot && milkType.equals("oat"))
        {
            steamTemperature = 165; // oat milk delicate
        }

        // Print instructions to make the drink
        System.out.println("Jada starts making the drink order:");
        System.out.println("Pour milk from the " + milkCarton);
        System.out.println("Steam milk to " + steamTemperature + " degrees");
        System.out.println("Serve in a " + mugType + " on a " + plateType);
        System.out.println();
        System.out.println("Order ready!! " + size + " latte, " + milkType + " milk, steamed to " + steamTemperature);

    }
}
