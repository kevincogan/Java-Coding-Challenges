import java.util.Scanner;
public class OneToTen_for
{
    public static void main(String [] args)
    {
        // Use a for loop to print out the numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int i;
        for(i = num; i <= 20; i++)
        {
        
        System.out.print(i + " ");
        }
        System.out.println();
    }
}