public class Time
{
   // Private variables
   private int hours;
   private int minutes;
   // Constructor (with a String parameter)
   public Time(String s_time)
   {
       String h = s_time.substring(0,2);
       String m = s_time.substring(2,4);
       
       hours = Integer.parseInt(h);
       minutes = Integer.parseInt(m);
   }
   // isLater(Time otherTime) // boolean method to compare two times
   public boolean isLater(Time otherTime)
   {
       if (hours > otherTime.hours)
       {
           return true;
       }
       else if (hours == otherTime.hours && minutes >otherTime.minutes)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   // String toString() // return a String representation of the time (hh:mm)
   
   public String toString()
   {
       if (hours <= 9 && minutes <= 9)
       {
       return "0" + hours + ":" + 0 + minutes;
       }
        else if (hours <= 9)
       {
           return "0" + hours + ":" + minutes;
       }
       else if (minutes <= 9)
       {
           return hours + ":" + 0 + minutes;
       }
       else
       {
           return hours + ":" + minutes;
       }
       
   }
   
   
   
   
   
   
}