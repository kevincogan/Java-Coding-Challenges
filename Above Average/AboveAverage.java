import java.util.Scanner;
public class AboveAverage
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers: ");
		int num = in.nextInt();
		double [] lst = new double [num];

		int i;
		double sum = 0;
		for (i = 0; i < num ; i++) 
		{
			lst[i] = in.nextFloat();
			sum = sum + lst[i];
		}
		double avg = sum / num;

		System.out.print("The above average number are:");
		for (i = 0; i < num; i++)
		{
			if (lst[i] > avg) 
			{
				System.out.print(" " + lst[i]);
			}
		}
		System.out.println();


	}
}