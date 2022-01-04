import java.util.Scanner;
public class Temp
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Give me a Fahrenheit temperature: ");
		int temp = in.nextInt();
		boolean fahr = Teen.isTeenager(temp);
		System.out.println("In Celsius that would be: " + fahr);

	}
}