import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;   

public class ListSort
{
    public static void main(String[] arg)
    {
    Scanner in = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<Integer>();
    int num = in.nextInt();
    while(num != -1)
    {
        numbers.add(num);
        num = in.nextInt();
    }
    Collections.sort(numbers);
    System.out.print("Sorted: ");
    for(int number : numbers)  // The Integer object is automatically converted back to an int (unbox)
        System.out.print(number + " ");
}
}