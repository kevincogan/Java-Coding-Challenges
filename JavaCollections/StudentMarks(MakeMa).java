import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MakeMap
{
    // No main method required.
    public static HashMap makeMap(Scanner s)
    {
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        while(s.hasNext())
        {
            String[] input = s.nextLine().split(" ");
            students.put(input[0], Integer.parseInt(input[1]));
        }
        return(students);
    }
}