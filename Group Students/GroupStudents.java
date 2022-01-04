import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroupStudents
{
    public static void main(String args[])
    {
    	try
    	{
    		Scanner input = new Scanner(new File(args[0]));
    		int number = input.nextInt();
    		Student [] group = new Student [number];
    		int i;
    		for (i = 0; i < number ; i++ ) 
    		{
    			String name = input.next();
    			int grade = input.nextInt();
    			//System.out.println(name + " " + grade);

    			Student pupil = new Student(name, grade);
    			group[i] = pupil;
    		}
    		Student.print(group);	



    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("File not found.");
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Check indexing is correct.");
    	}
    }
}