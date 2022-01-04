import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Previous
{
    public static void main(String [] args)
    {
        System.out.println("Enter some numbers (-1 to end)");
        Scanner in = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<Integer>();
        List<Integer> seen = new ArrayList<Integer>();
        int num = in.nextInt();
        while(num != -1)
        {
            if(numbers.contains(num))
            {
                seen.add(num);
            }
            numbers.add(num);
            num = in.nextInt();
        }
        System.out.println("Previous:");
        for(Integer bucket : seen)
        {
            System.out.println(bucket);
        }
    }
}