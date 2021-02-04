package inheritance;

public class Cube extends Luggage {
	double side = 0;
	String type = "Cube";
	public Cube(double s)
	{
		side = s;
	}
	
	public double getVolume()
	{
		return Math.pow(side, 3);
	}
	public String toString()
	{
		return "Cube: Volume: " + getVolume() + ". Side: " + side + ".";
	}
	public String getType()
	{
		return type;
	}
}
