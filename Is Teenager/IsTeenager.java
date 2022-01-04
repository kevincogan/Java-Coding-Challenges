import java.util.Scanner;
public class IsTeenager
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		if (age < 20 && age > 12)
		{
			System.out.println("you are a teenager");
		}
		else
		{
			System.out.println("you are not a teenager.");
		}
	}
}