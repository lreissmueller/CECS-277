package inheritance;

public class Cone extends Luggage {
	double radius = 0;
	double height = 0;
	String type = "Cone";
	public Cone(double r, double h)
	{
		radius = r;
		height = h;
	}
	public double getVolume()
	{
		return Math.PI * Math.pow(radius, 2) * height / 3;
	}
	public String toString()
	{
		return "Cone: Volume: " + getVolume() + 
		". Radius: " + radius + ". Height: " + height + ".";
	}
	public String getType()
	{
		return type;
	}
}
