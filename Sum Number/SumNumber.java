import java.util.Scanner;
public class SumNumber
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int i;
		int total = 0;
		for (i = 1; i <= num ; i++ ) 
		{
			total = total + i;
		}
		System.out.println(total);
	}
}