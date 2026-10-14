public class BackwardNames
{
    public static void main(String[] args)
    {
        String name = "David";
        String backwards = "";

        for (int i = name.length() -1; i >= 0; i--)
        {
            backwards= backwards + name.substring(i,i+1);
        }
        System.out.println(name);
        System.out.println("Order ready for " + backwards + "!");
    }
}
