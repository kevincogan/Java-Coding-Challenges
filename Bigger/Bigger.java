import java.util.Scanner;
public class Bigger
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int number_1 = in.nextInt();
		int number_2 = in.nextInt();

		if (number_1 > number_2)
		{
			System.out.println(number_1 + " is the biggest.");
		}
		else
		{
			System.out.println(number_2 + " is the biggest.");
		}
	}
}