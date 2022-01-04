import java.util.Scanner;
public class NoMinusOne
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = in.nextInt();
		int num = 0;
		int count = 0;
		while (number != -1)
		{
			num = number;
			number = in.nextInt();
			count = count + 1;
		}
		System.out.println(count + " number were entered.");

	}
}