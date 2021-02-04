package war;
import java.util.ArrayList;

public class Hand extends Deck {
		ArrayList<Card> hand;
		public Hand()
		{
			hand = new ArrayList<Card>();
		}
		public void add(Card c)
		{
			hand.add(c);
		}
		public void display()
		{
			int count = 0;
			for(int n = 0; n < hand.size(); n++)
			{	
				hand.get(count).display();
				System.out.print(", ");
				count++;
				System.out.println();
			}
		}
		public Card getCard()
		{
			if(hand.size() != 0)
			{
				return hand.get(0);
			}
			return null;
		}
		public Card deal()
		{
			if(hand.size() != 0)
			{
				Card temp1 = hand.get(0);
				hand.remove(0);
				return temp1;
			}
			return null;
		}
		public int cardsLeft()
		{
			return hand.size();
		}
		
}
