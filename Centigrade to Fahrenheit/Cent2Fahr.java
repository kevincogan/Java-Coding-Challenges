import java.util.Scanner;
public class Cent2Fahr
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is the temperature in degrees centigrade: ");
		int cent = in.nextInt();
		double fahr = (cent * 1.8) + 32;

		System.out.println("Temperature in fahrenheit: " + fahr);
	}
}