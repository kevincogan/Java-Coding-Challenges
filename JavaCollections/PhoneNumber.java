import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers
{
    public static void main(String [] args)
    {
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        Scanner in = new Scanner(System.in);
        Map<String, String> numbers = new HashMap<String, String>();
        String x = in.nextLine();
        while(x.equals("!!") == false)
        {
            String[] input = x.split(" ");
            if(input[1].equals("?"))
            {
                if(numbers.containsKey(input[0]))
                {
                    System.out.println(input[0] + " has number " + numbers.get(input[0]));
                }
                else
                {
                     System.out.println("Sorry, there is no " + input[0]);
                }
            }
            else
            {
                numbers.put(input[0], input[1]);
            }
            x = in.nextLine();
        }
        System.out.println("Bye");
    }
}