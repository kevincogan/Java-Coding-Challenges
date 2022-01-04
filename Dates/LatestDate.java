import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

   public Date()
   {
	   day = 0;
	   month = 0;
	   year = 0000;
   }
    //Split string.
    public Date(String sdate)
    {
         String[] date = sdate.split(" ");
         day = Integer.parseInt(date[0]);
         month = Integer.parseInt(date[1]);
         year = Integer.parseInt(date[2]);
        
    }
    
    // Insert the isAfter method here.
    public boolean isAfter(Date second_date)
    {
        if (year < second_date.year)
        {
            return true;
        }
        
        else if (year == second_date.year && month < second_date.month)
        {
            return true;
        }
        
        else if (year == second_date.year && month == second_date.month)
        {
            if (day <= second_date.day)
            {
            return true;
            }
        }
         return false;
    }
    
    // Here is the main method which will read in a sequence of dates.
    // Modify it so that it prints the latest date.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Date latest = new Date();
        while(in.hasNextLine())
        {
           String line = in.nextLine();
           if(line.length() != 0)
           {
              Date new_date = new Date(line);
              // Do what you want with the date.
              if (latest.isAfter(new_date))
              {
                  latest = new_date;
              }
           }

        }
        System.out.println(latest); // Print the latest date
    }
}