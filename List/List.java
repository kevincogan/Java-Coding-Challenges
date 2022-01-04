import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] arg)
    {
    System.out.println("Enter numbers: ");
    Scanner in = new Scanner(System.in);
    List<Integer> odd = new ArrayList<Integer>();
    List<Integer> even = new ArrayList<Integer>();
    int num = in.nextInt();
    while(num != -1)
    {
        if(num%2 == 0)
        {
            even.add(num); 
        }
        else
        {
            odd.add(num);
        }
        num = in.nextInt();
    }
    System.out.print("Odd:");
    for(int number : odd)  // The Integer object is automatically converted back to an int (unbox)
        System.out.print(number + " ");
    System.out.println("");
    System.out.print("Even:");
    for(int number : even)  // The Integer object is automatically converted back to an int (unbox)
        System.out.print(number + " ");
    }
}