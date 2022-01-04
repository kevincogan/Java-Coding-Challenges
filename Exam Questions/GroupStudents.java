import java.io.*;
import java.util.Scanner;

public class GroupStudents
{

	public static void main(String [] args) throws FileNotFoundException
	{
		try
		{
			String file = args[0];
			String file_2 = args[1];
			Scanner input = new Scanner(new File(file));
			FileWriter write_to = new FileWriter(file_2);
			int num = input.nextInt();
			Student [] group = new Student[num];

			int i;
			for (i = 0; i < num; i++) 
			{
				String name = input.next();
				int grade = input.nextInt() + 1;
				Student pupil = new Student(name, grade);
				write_to.write(pupil +"\n");
			}
			write_to.close();
		}
		catch(FileNotFoundException e)
    	{
    		System.out.println("File not found.");
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Check indexing is correct.");
    	}
        catch(IOException e)
        {
            System.out.println("An error has occurred");
        }
	}
}