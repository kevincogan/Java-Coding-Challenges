public class Period
{
   // Private variables
   private Time time1;
   private Time time2;
   // Constructor (with two Time parameters)
   public Period(Time t1, Time t2)
   {
       time1 = t1;
       time2 = t2;
   }
   // overlaps(Period otherPeriod) // boolean method to check if two periods overlap
   public boolean overlaps(Period second_period)
   {
       if (time1.isLater(second_period.time1) && second_period.time2.isLater(time2) )
       {
           return true;
       }
       else if ( second_period.time2.isLater(time2) && time2.isLater(second_period.time2) )
       {
           return true;
       }
        else if (time1.isLater(second_period.time2) && second_period.time2.isLater(time1) )
       {
           return true;
       }
       else if ( second_period.time2.isLater(time1) && time2.isLater(second_period.time2) )
       {
           return true;
       }
       

       else
       {
           return false;
       }
   }
   // String toString() // return a String representation of the Period
   public String toString()
   {
       return time1 + " " + "->" + " " + time2;
   }
}