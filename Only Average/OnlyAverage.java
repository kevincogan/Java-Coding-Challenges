import java.util.Scanner;
public class OnlyAverage
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers: ");
		int num = in.nextInt();
		System.out.print("Enter " + num + " numbers: ");
		int i;
		double total = 0;
		for (i = 0; i < num ; i++) 
		{
			double num1 = in.nextFloat();
			total = total + num1 ;
		}
		double avg = total / num;
		System.out.println(avg);

	}
}