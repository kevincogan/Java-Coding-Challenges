import java.util.Scanner;

public class IsTeenager
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num = in.nextInt();
        if (num > 12 && num < 20) {
            System.out.println("You are a teenager.");
            
        }
        else {
            System.out.println("You are not a teenager.");
            
        }
        
    }
}