import java.util.Scanner;
public class Inches2cm
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a quantity in inches: ");
		int num1 = in.nextInt();
		double converted = num1 * 2.54;
		System.out.println(num1 + " inch is " + converted);
	}
}