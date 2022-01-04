import java.util.Scanner;
public class DoubleDivision
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter two floating point number: ");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double div = num1 / num2;
		System.out.println(num1 + " / " + num2 + " is " + div);
	}
}