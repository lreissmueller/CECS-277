package inheritance;

public class Pyramid extends Luggage {
	double base = 0;
	double height = 0;
	String type = "Pyramid";
	public Pyramid(double b, double h)
	{
		base = b;
		height = h;
	}
	public double getVolume()
	{
		return Math.pow(base, 2) * height / 3;
	}
	public String toString()
	{
		return "Pyramid: Volume: " + getVolume() + ". Base: " + 
		base + ". Height: " + height + ".";
	}
	public String getType()
	{
		return type;
	}
}
