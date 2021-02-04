package war;

public enum Suit 
{
	SPADES("Spades"),
	CLUBS("Clubs"),
	HEARTS("Hearts"),
	DIAMONDS("Diamonds");
	
	String suit;
	private Suit(String s)
	{
		suit = s;
	}
	public String getSuit()
	{
		return suit;
	}
	public String toString(String suit)
	{
		return "Suit: " + getSuit();
	}
	
}
