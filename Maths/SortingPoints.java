import java.lang.Math;
public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    public boolean lessThan(Order other)
    {
    	Point other_var = (Point) other;
    	if(Math.sqrt(Math.pow((x), 2) + Math.pow((y), 2)) < Math.sqrt(Math.pow((other_var.x), 2) + Math.pow((other_var.y), 2)))
    	{
    	    return true;
    	}
    	else
    	{
    	return false;
    	}
    }
}