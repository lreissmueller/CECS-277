package inheritance;

public class Torus extends Luggage {
	double majorRadius = 0;
	double minorRadius = 0;
	String type = "Torus";
	public Torus(double maR, double miR)
	{
		if(miR > maR)
		{
			majorRadius = miR;
			minorRadius = maR;
		}
		else
		{
		majorRadius = maR;
		minorRadius = miR;
		}
	}
	public double getVolume()
	{
		return (Math.PI * Math.pow(minorRadius, 2)) * (2 * Math.PI * majorRadius);
	}
	public String toString()
	{
		return "Torus: Volume: " + getVolume() + ". Minor Radius: "
		+ minorRadius + ". Major Radius: " + majorRadius + ".";
	}
	public String getType()
	{
		return type;
	}
}
