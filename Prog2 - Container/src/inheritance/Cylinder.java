package inheritance;

public class Cylinder extends Luggage {
	double radius = 0;
	double length = 0;
	String type = "Cylinder";
	public Cylinder(double r, double l)
	{
		radius = r;
		length = l;
	}
	public double getVolume()
	{
		return Math.PI * Math.pow(radius, 2) * length;
	}
	public String toString()
	{
		return "Cylinder: Volume: " + getVolume() + ". Radius: " 
		+ radius + ". Length: " + length;
	}
	public String getType()
	{
		return type;
	}
	
}
