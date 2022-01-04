import java.util.Scanner;
public class LengthOfName
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Tell me your name: ");
		String name = in.next();
		int leng = name.length();
		System.out.println("Hello " + name + ", your name has " + leng + " letters.");
	}
}