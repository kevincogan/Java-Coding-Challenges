public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(String sdate)
    {
         String[] date = sdate.split(" ");
         day = Integer.parseInt(date[0]);
         month = Integer.parseInt(date[1]);
         year = Integer.parseInt(date[2]);
        
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    // Create a boolean method which will check to sae that the date is on or after the date that is passed as a parameter.

    public boolean isOnOrAfter(Date second_date)
    {
        if (year > second_date.year)
        {
            return true;
        }
        
        else if ( month > second_date.month )
        {
            return true;
        }
        
        else if (day > second_date.day)
        {
            return true;
        }
        else if (year == second_date.year && month == second_date.month && day == second_date.day)
        {
            return true;
        }
        
        else
        {
            return false;
        }
        
    }
    
}