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
    	if (Math.sqrt(x + y) < Math.sqrt(other_var.x + other_var.y))
    	{
    	    return true;
    	}

    	return false;

    }
}