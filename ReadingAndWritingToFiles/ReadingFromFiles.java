import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNames
{
    public static void main(String args[])
    {
        try
        {

            String file = args[0];

            Scanner input = new Scanner(new File(file));

            int number = input.nextInt();
            String [] names;
            names = new String [number];

            int i;
            for(i = number -1; i >= 0; i--)
            {
                String nam = input.next();
                names[i] = nam;
            }
            System.out.println("The names in reverse order are: ");
            for (i = 0; i < number ; i++) 
            { 
                System.out.print(names[i] + " ");

            }
            System.out.println();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Usage: java ReadNames <filename>");
        }

        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}