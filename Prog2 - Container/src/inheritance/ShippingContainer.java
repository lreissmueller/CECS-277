package inheritance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShippingContainer {
	private ArrayList<Luggage> luggage;
	Scanner scanner = new Scanner(System.in);
	public ShippingContainer()
	{
		luggage = new ArrayList<Luggage>();
		Box b = new Box(12, 10.1, 14.7);
		Cone c1 = new Cone(6.9, 5);
		Cube c2 = new Cube(6.4);
		Cylinder c3 = new Cylinder(4.20, 10.5);
		Icosahedron i = new Icosahedron(6);
		Pyramid p = new Pyramid(6.7,3);
		Sphere s = new Sphere(20);
		Sphere s1 = new Sphere(3.14);
		Torus t = new Torus(4, 8.1);
		Torus t1 = new Torus(100.3, 80);
		
		luggage.add(b);
		luggage.add(c1);
		luggage.add(c2);
		luggage.add(c3);
		luggage.add(i);
		luggage.add(p);
		luggage.add(s);
		luggage.add(s1);
		luggage.add(t);
		luggage.add(t1);
	}
	public static void sort(ArrayList<Luggage> arrayList)
	{
		Collections.sort(arrayList);
	}
	public void display()
	{
		sort(luggage);
		for(int i = 0; i < luggage.size(); i++)
		{
			System.out.println("(" + (i+1) + ") " + luggage.get(i).toString());
		}
		System.out.println();
	}
	
	public void add(String type)
	{
		if(type.equalsIgnoreCase("Box"))
		{
			System.out.println("Please enter the width, height, length SEPERATELY for this " + type + ".");
			double w = scanner.nextDouble();
			double h = scanner.nextDouble();
			double l = scanner.nextDouble();
			luggage.add(new Box(w, h, l));
			
		}
		else if(type.equalsIgnoreCase("Cube"))
		{
			System.out.println("Please enter the side length for this " + type + ".");
			double s = scanner.nextDouble();
			luggage.add(new Cube(s));
		}
		else if(type.equalsIgnoreCase("Cone"))
		{
			System.out.println("Please enter the radius and height SEPERATELY for this " + type + ".");
			double r = scanner.nextDouble();
			double h = scanner.nextDouble();
			luggage.add(new Cone(r, h));
		}
		else if(type.equalsIgnoreCase("Cylinder"))
		{
			System.out.println("Please enter the radius and length SEPERATELY for this " + type + ".");
			double r = scanner.nextDouble();
			double l = scanner.nextDouble();
			luggage.add(new Cylinder(r, l));
		}
		else if(type.equalsIgnoreCase("Icosahedron"))
		{
			System.out.println("Please enter the side length for this " + type + ".");
			double s = scanner.nextDouble();
			luggage.add(new Icosahedron(s));
		}
		else if(type.equalsIgnoreCase("Pyramid"))
		{
			System.out.println("Please enter the base and height SEPERATELY for this " + type + ".");
			double b = scanner.nextDouble();
			double h = scanner.nextDouble();
			luggage.add(new Pyramid(b, h));
		}
		else if(type.equalsIgnoreCase("Sphere"))
		{
			System.out.println("Please enter the radius for this " + type + ".");
			double r = scanner.nextDouble();
			luggage.add(new Sphere(r));
		}
		else if(type.equalsIgnoreCase("Torus"))
		{
			System.out.println("Please enter the Major Radius and Minor Radius SEPERATELY for this " + type + ".");
			double maR = scanner.nextDouble();
			double miR = scanner.nextDouble();
			luggage.add(new Torus(maR, miR));
		}
		System.out.println("New " + type + " added to container.");
		sort(luggage);
	}
	public void remove(int i)
	{
		if(luggage.size() == 0)
		{
			System.out.println("No items to remove. Try creating instead of destroying, for a change.");
		}
		else
		{
			System.out.println(luggage.get(i - 1).getType() + " removed.\n");
			luggage.remove(i - 1);
		}
		sort(luggage);
	}


}
