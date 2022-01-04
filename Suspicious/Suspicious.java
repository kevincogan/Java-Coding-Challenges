import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;

public class Suspicious
{
    public static void main(String [] args)
    {
        try
    {
    {
        File stuFile = new File(args[0]);
        Scanner stuScanner = new Scanner(stuFile);
        Set<String> names = new HashSet<String>();
        while(stuScanner.hasNext())
        {
            names.add(stuScanner.nextLine());
        }
        File delFile = new File(args[1]);
        Scanner delScanner = new Scanner(delFile);
        String x;
        int i = 1;
        while(delScanner.hasNext())
        {
            x = delScanner.nextLine();
            if(names.contains(x))
            {
                System.out.println(i + ". " + x);
                i++;
            }
        }
    }
    }
    catch(FileNotFoundException f)
    {
        System.out.println("File not found.");
    }
}
}