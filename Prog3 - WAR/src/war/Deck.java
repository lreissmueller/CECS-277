package war;
// deck class
import java.util.Random; // need this for the shuffle
import java.util.ArrayList;

// Deck constructor 
public class Deck {
	private ArrayList<Card> storage; // make an array of cards
	public Deck()
	{

		storage = new ArrayList<Card>();
		
		Card C1;
		for(Suit suit: Suit.values())
		{
			for(Rank rank: Rank.values())
			{
				C1 = new Card(rank, suit);
				storage.add(C1);
			}}
		}
		
		public void display()
		{
			int count = 0;
			if(storage.size() == 0)
			{
				System.out.print(storage.size());
			}
			else
			{
				for(int n = 0; n < 13; n++)
				{
					for(int m = 0; m < 4; m++)
					{
						storage.get(count).display();
						System.out.print(", ");
						count++;
					}
					System.out.println();
				}
			}
			
		}

		public void shuffle()
		{
			Random numGen = new Random();
			for(int i = 0; i < 10000; i++)
			{
				int x = numGen.nextInt(52);
				int y = numGen.nextInt(52);
				Card temp = storage.get(x);
				storage.set(x, storage.get(y));
				storage.set(y, temp);
			}
		}
		public Card deal()
		{
			Card temp1 = storage.get(0);
			storage.remove(0);
			return temp1;
		}
		
		public int cardsLeft() // how many cards are left in the deck
		{
			return storage.size();
		}
		public Card getCard()
		{
			Card c = storage.get(0);
			return c;
		}
		public void add(Card c)
		{
			storage.add(c);
		}
	}
