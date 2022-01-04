import java.io.*;
import java.util.Scanner;

public class WriteStudents
{
    public static void main(String args[])
    {
    	try
    	{
    	    String file = args[0];
    	    String file2 = args[1];
            FileWriter writeTo = new FileWriter(file2);
    		Scanner input = new Scanner(new File(file));
    		int number = input.nextInt();
            writeTo.write(number + "\n");
    		int i;
    		for (i = 0; i < number ; i++ ) 
    		{
    			String name = input.next();
    			int grade = (input.nextInt()) + 1;
    			//System.out.println(name + " " + grade);
                writeTo.write(name + " " + grade + "\n");

    		}

            writeTo.close();



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