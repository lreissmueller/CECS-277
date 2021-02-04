package inheritance;

public class Icosahedron extends Luggage {
	double side = 1;
	String type = "Icosahedron";
	public Icosahedron(double s)
	{
		side = s;
	}
	public double getVolume()
	{
		return 5 * (3 + Math.sqrt(5)) * Math.pow(side, 3) / 12;
	}
	public String toString()
	{
		return "Icosahedron: Volume: " + getVolume() + ". Side: " 
		+ side + ".";
	}
	public String getType()
	{
		return type;
	}
}
