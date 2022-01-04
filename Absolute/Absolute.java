import java.util.Scanner;
public class Absolute
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = in.nextInt();

		if (number < 0)
		{
			int num = number * -1;
			System.out.println("The absolute value is " + num);
		}

		else
		{
			System.out.println("The Absolute value is " + number);
		}

	}
}