public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }
   
   public Point midPoint(Point p2)
   {
       double xs = ((x + p2.x)/ 2);
       double ys = ((y + p2.y)/2);
       
       return new Point(xs, ys);
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}