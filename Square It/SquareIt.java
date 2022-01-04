import java.util.Scanner;

public class SquareIt
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int number;
		number = in.nextInt();

		int num2 = number * number;
		System.out.println(number + " squared is " + num2);
	}
}