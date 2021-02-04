// Luke Reissmueller
// CECS 277-01
// Prog 1 - Solitaire Prime
// 09/08/2020
// I certify that this program is my own original work. I did not copy any part of this program from
// any other source. I further certify that I typed each and every line of code in this program.
package solitaire;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu();
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		String outcome = "";
		Deck dk = new Deck();
		while(s != 5)
		{
			if(s == 1)
			{
				dk = new Deck();
				System.out.println("New deck created!\nEnter '2' to display your deck.\nEnter '3' to shuffle your deck.\nEnter '4' to play.\nEnter '5' to quit.");
			}
			else if(s == 2)
			{
				dk.display();
				System.out.println("Deck displayed!\nEnter '2' to display your deck again.\nEnter '3' to shuffle your deck.\nEnter '4' to play.\nEnter '5' to quit.");
			}
			
			else if(s == 3)
			{
				dk.shuffle();
				dk.display();
				System.out.println("Deck shuffled!\nEnter '2' to display deck again.\nEnter '3' to shuffle deck again.\nEnter '4' to play.\nEnter '5' to quit.");
			}
			
			else if(s == 4)
			{
				//play game
				int add = 0;
				int sum = 0;
				int piles = 0;
				int end = 0;
				System.out.println("Playing Solitaire Prime!!!");
				while(dk.cardsLeft() > 0)
				{
					add = dk.getCard().getValue();
					sum = sum + add;
					dk.deal().display();
					System.out.print(", ");
					if(dk.cardsLeft() == 0)
					{
						end = sum;
					}
					else if (isPrime(sum))
					{
						System.out.print("Prime: " + sum);
						System.out.println();
						sum = 0;
						piles++;
					}
				}
				if(isPrime(end))
				{
					piles++;
					outcome = "Winner in " + piles + " piles!"; 
				}
				else
				{
					outcome = "You're a loser if I've ever seen one!";
				}
				System.out.println(outcome);
				System.out.println("\nEnter '1' to create new deck.\nEnter '5' to quit.");
				dk = new Deck();
			}
			s = scanner.nextInt();
		}
		System.out.println("Thanks for playing!");
	}
	
	public static void menu()
	{
		System.out.println("Welcome to Solitaire Prime!\n1) New Deck\n2) Display Deck\n3) Shuffle Deck\n4) Play Solitaire Prime\n5) Exit");
	}
	public static boolean isPrime(int num)
	{
		if(num == 1)
		{
			return false;
		}
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
