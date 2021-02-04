package war;

public class Card {
	private Suit suit;
	private Rank rank;
	public Card(Rank r, Suit s)
	{
		rank = r;
		suit = s;
	}
	
	
	public void display()
	{
		if(rank.getRank() < 11)
		{
			System.out.print(rank.getRank() + " of " + suit.getSuit());	
		}
		else
			System.out.print(rank + " of " + suit.getSuit());	
	}
	
	public int getValue()
	{
		return rank.getRank();
	} 
}
