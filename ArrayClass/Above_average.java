//
// Supplied code to help ensure there will be no output formatting issues.
//
import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        double [] lst = new double [num];
        
        
        System.out.print("Enter " + num + " numbers: ");

        // Now read in the numbers
        int i = 0;
        while(i < num)
        {
            lst[i] = in.nextFloat();
            i++;
        }
        
        // Print out the numbers greater than the average
        int j = 0;
        double sum = 0.0;
        while(j < num)
        {
            sum = sum + lst[j];
            j++;
        }
        
        double avg = sum / num;
        System.out.println("The above average numbers are:");
        int f = 0;
        while(f < num)
        {
            if(lst[f] > avg)
                System.out.print(" " + lst[f]);
            f++;
        }

        // You can use the following code to print out one number

        System.out.println(); // Should finish with a new line
    }
}