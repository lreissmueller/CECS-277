package inheritance;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Luggage implements Comparable {
	double volume = 1;
	String type = "";
	public int compareTo(Object other)
	{
		if(this.getVolume() < ((Luggage) other).getVolume())
		{
			return -1;
		}
		else if(this.getVolume() == ((Luggage)other).getVolume())
		{
			return 1;
		}
		return 0;
	}
	public double getVolume()
	{
		return volume;
	}
	
	public String toString()
	{
		return type + ": Volume: " + getVolume();
	}
	public String getType()
	{
		return type;
	}
}
