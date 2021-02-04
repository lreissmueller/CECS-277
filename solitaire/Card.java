package solitaire;

public class Card {
	private char suit;
	private char rank;
	
	public Card(char r, char s) // constructor
	{
		suit = s;
		rank = r;
	}
	
	public void display()
	{
		System.out.print(rank + "" + suit);	
	}
	
	public int getValue()
	{
		if(rank == 'K' || rank == 'Q' || rank == 'J' || rank == 'T')
		{
			return 10;
		}
		else if (rank == '2')
		{
			return 2;
		}
		else if(rank == '3')
		{
			return 3;
		}
		else if(rank == '4')
		{
			return 4;
		}
		else if(rank == '5')
		{
			return 5;
		}
		else if(rank == '6')
		{
			return 6;
		}
		else if(rank == '7')
		{
			return 7;
		}
		else if(rank == '8')
		{
			return 8;
		}
		else if(rank == '9')
		{
			return 9;
		}
		else
		{
			return 1;
		}
	} 
}
