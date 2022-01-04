import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordLength
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int max = 1;
        while(in.hasNext())
        {
        String input = in.nextLine();
        for(String x : input.split(" "))
        {
            int len = x.trim().length();
            if(numbers.containsKey(len))
            {
                int current = numbers.get(len);
                current++;
                numbers.put(len, current);
            }
            else
            {
                numbers.put(len, 1);
                if(len > max)
                {
                    max = len;
                }
            }
        }
        }
        int i = 1;
        while(i <= max)
        {
            if(numbers.containsKey(i))
            {
                System.out.println(i + ": " + numbers.get(i));
            }
            i++;
        }
    }
}