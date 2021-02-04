package inheritance;

public class Box extends Luggage {
	double width = 0;
	double height = 0;
	double length = 0;
	String type = "Box";
	public Box(double w, double h, double l)
	{
		width = w;
		height = h;
		length = l;
	}
	
	public double getVolume() {
		return width * height * length;
	}
	
	public String toString()
	{
		return "Box: Volume: " + getVolume() + ". Width: " + width +
				". Height: " + height + ". Length: " + length + ".";
	}
	public String getType()
	{
		return type;
	}

}
