public class Circle
{
	double radius;
	public Circle(double rad)
	{
		this.radius = rad;
	}

	public double area()
	{
		return Math.PI * radius * radius;
	}

	public String toString()
	{
		return String.format("The area is %.3f" ,area());
	}
}