import java.util.Scanner;
public class SumIt
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter two numbers: ");

		int num1 = in.nextInt();
		int num2 = in.nextInt();

		int sum = num1 + num2;
		System.out.println(num1 + " and " + num2 + " is " + sum);


	}
}