//	Luke Reissmueller
//	CECS 277-01
//	Prog 2 - Inheritance (luggage)
//	09/22/2020

//	I certify that this program is my own original work. I did not copy any part of this program from
//	any other source. I further certify that I typed each and every line of code in this program.

package inheritance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu();
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		ShippingContainer crate = new ShippingContainer();
		while(s != 5)
		{
			if(s == 1)
			{
				crate = new ShippingContainer();
				System.out.println("New Shipping Container with 10 luggage items created. ");
				System.out.println("Choose next option: \n2) Add luggage\n3) Remove luggage\n4) Show all luggage\n5) Quit");		
			}
			else if(s == 2)
			{
				System.out.println("Before we create your luggage item, please enter its shape from the list below:\n\u2022Box\n\u2022Cone\n\u2022Cube\n\u2022Cylinder\n\u2022Icosahedron\n\u2022Pyramid\n\u2022Sphere\n\u2022Torus");
				crate.add(scanner.next());
				crate.display();
				System.out.println("1) Create new Container \n2) Add luggage\n3) Remove luggage\n4) Show all luggage\n5) Quit");
			}
			
			else if(s == 3)
			{
				System.out.println("What luggage would you like to remove from the shipping container?");
				crate.remove(scanner.nextInt());
				System.out.println("Removing Luggage...");
				crate.display();
				System.out.println("1) Create new Container\n2) Add luggage\n3) Remove luggage\n4) Show all luggage\n5) Quit");
			}
			
			else if(s == 4)
			{
				System.out.println("Displaying all Luggage in Shipping Container...");
				crate.display();
				System.out.println("Luggage displayed!");
			}
			System.out.println();
			s = scanner.nextInt();
		}
		System.out.println("Come Again!");
	}
	public static void menu()
	{
		System.out.println("Welcome to Luggage Creator! \n1) Create new Shipping Container with 10 preset luggage items\n2) Add luggage to Shipping Container\n3) Remove luggage from the Shipping Container\n4) Show all luggage in the Shipping Container\n5) Quit");
	}
}
