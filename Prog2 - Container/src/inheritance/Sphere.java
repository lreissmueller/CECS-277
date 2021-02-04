package inheritance;

public class Sphere extends Luggage {
	double radius = 0;
	String type = "Sphere";
	public Sphere(double r)
	{
		radius = r;
	}
	public double getVolume()
	{
		return 4 * Math.PI * Math.pow(radius, 3) / 3;
	}
	public String toString()
	{
		return "Sphere: Volume: " + getVolume() + ". Radius: " + radius + ".";
	}
	public String getType()
	{
		return type;
	}
}
