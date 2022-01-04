import java.util.Scanner;
public class OneToNum
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int i = num;
		while (i <= 20)
		{
			System.out.print(i + " ");
			i = i + 1;
		}
	System.out.println("");
	}
}