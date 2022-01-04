import java.io.*;
import java.util.Scanner;

public class GroupStudents
{
	public static void main(String [] args)
	{
		String file = args[0];
		Scanner input = new Scanner(new File(file));
		int num = input.nextInt();
		Student [] group = new Student[num];

		int i;
		for (i = 0; i < num; i++) 
		{
			group[i] = input.next();
			System.out.println(group[i]);
		}
	}
}