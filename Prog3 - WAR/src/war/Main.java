// Luke Reissmueller
// CECS 277-01
// Prog 3 - WAR
// 10/6/2020
// I certify that this program is my own original work. I did not copy any part of this program from
// any other source. I further certify that I typed each and every line of code in this program.
package war;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu();
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		Deck d = new Deck();
		Hand p1 = new Hand(), p2 = new Hand();
		while(s != 5)
		{
			if(s == 1)
			{
				d = new Deck();
				System.out.println("New deck created!\nEnter '2' to shuffle the deck.\nEnter '3' to display the deck.\nEnter '4' to play.\nEnter '5' to quit.");
			}
			else if(s == 2)
			{
				d.shuffle();
				System.out.println("Deck shuffled!\nEnter '2' to shuffle deck again.\nEnter '3' to display deck again.\nEnter '4' to play.\nEnter '5' to quit.");
			}
			
			else if(s == 3)
			{
				d.display();
				System.out.println("Deck displayed!\nEnter '2' to shuffle t deck again.\nEnter '3' to display the deck.\nEnter '4' to play.\nEnter '5' to quit.");
			}
			
			else if(s == 4)
			{
				distribute(p1, p2, d);
				System.out.println("\n\nPlayer 1's Hand:\n ");
				p1.display();
				System.out.println("\n\nPlayer 2's Hand:\n ");
				p2.display();
				System.out.println("\nPress Any Key to Continue...");
				scanner.next();
				play(p1, p2, d);
				System.out.println("\nPress Any Key to Continue...");
				scanner.next();
				d = new Deck();
				p1 = new Hand();
				p2 = new Hand();
				menu();
			}
			s = scanner.nextInt();
		}
		System.out.println("Thanks for playing!");
	}
	
	public static void menu()
	{
		System.out.println("Welcome to War!\n1) Create new deck\n2) Shuffle deck\n3) Show deck\n4) Play War\n5) Exit");
	}
	public static void distribute(Hand h, Hand h2, Deck dk)
	{
		System.out.println("Dealing Cards...");
		for(int i = 0; i < 26; i++)
		{
			h.add(dk.deal());
		}
		for(int j = 0; j < 26; j++)
		{
			h2.add(dk.deal());
		}
		System.out.println("Cards Delt. Let's Play!");
	}

	public static boolean noCards(Hand h)
	{
		if(h.cardsLeft() == 0)
		{
			return true;
		}
		return false;
	}
	//returns true on tie
	public static boolean warTime(Hand h, Hand h2)
	{
		if(h.getCard().getValue() == h2.getCard().getValue())
		{
			return true;
		}
		return false;
	}
	//returns true if both parties have enough cards for war, false otherwise
	public static boolean warReady(Hand h, Hand h2)
	{
		if(h.cardsLeft() > 3 && h2.cardsLeft() > 3)
		{
			return true;
		}
		return false;
	}
	public static void addPile(Hand h, Deck dk)
	{
		while(0 < dk.cardsLeft())
		{
			h.add(dk.deal());
		}
	}
	public static void play(Hand h, Hand h2, Deck dk)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter max battle number: ");
		int max = scanner.nextInt();
		int actual = 0;
		
	
		while(h.cardsLeft() > 0 && h2.cardsLeft() > 0 && max > actual)
		{
			if(h.getCard() == null || h2.getCard() == null)
			{
				break;
			}
			else
			{
				System.out.print("Player 1 plays card: ");
				h.getCard().display();
				System.out.println();
				System.out.print("Player 2 plays card: ");
				h2.getCard().display();
				System.out.println();
				if(h.getCard().getValue() > h2.getCard().getValue())
				{
					h.add(h2.deal());
					h.add(h.deal());
					addPile(h,dk);
					actual+=1;
					System.out.println("Player 1 wins round " + actual);
				}
				else if(h.getCard().getValue() < h2.getCard().getValue())
				{
					h2.add(h.deal());
					h2.add(h2.deal());
					addPile(h2,dk);
					actual +=1;
					System.out.println("Player 2 wins round " + actual);
				}
				else if(warTime(h,h2) && warReady(h, h2))
				{
					System.out.println("WAR TIME!");
					for (int i = 0; i < 3; i++) 
					{
						System.out.println("War card for player 1: xx");
						dk.add(h.deal());
						System.out.println("War card for player 2: xx");
						dk.add(h2.deal());
					}
					actual +=1;
				}
				else
				{
					break;
				}
			}
			
		}
		if(actual >= max)
		{
			System.out.println("\n\n\nGAME OVER.\nPlayer 1:\n");
			h.display();
			System.out.println("\n\nPlayer 2:\n");
			h2.display();
			System.out.println("\n\n\n ACTUAL: " + actual);
		}
		if(h.cardsLeft() > h2.cardsLeft())
		{
			System.out.println("PLAYER 1 WINS THE GAME");		}
		if(h2.cardsLeft() > h.cardsLeft())
		{
			System.out.println("PLAYER 2 WINS THE GAME");		
		}
		if(h.cardsLeft() == h2.cardsLeft())
		{
			System.out.println("TIE GAME");
		}
		
		
	}
}
