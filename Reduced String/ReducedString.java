import java.util.Scanner;
public class ReducedString
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		int num = in.nextInt();
		String string = in.next();
		String reduced = string.substring(0,num) + string.substring((num + 1));
		System.out.println(reduced);


	}
}