import java.util.Scanner;
public class LastLetter
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = in.next();
		char last = name.charAt(name.length() - 1);
		System.out.println("The last letter in your name is " + last);
	}
}