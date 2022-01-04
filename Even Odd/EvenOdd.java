import java.util.Scanner;
public class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = in.nextInt();
		int mod = number % 2;
		if (mod == 0 )
		{
			System.out.println(number + " is even.");
		}

		else
		{
			System.out.println(number + " is odd.");
		}
	}

}

