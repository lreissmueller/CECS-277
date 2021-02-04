package war;

public enum Rank 
{
	Ace(14),
	Two(2),
	Three(3),
	Four(4),
	Five(5),
	Six(6),
	Seven(7),
	Eight(8),
	Nine(9),
	Ten(10),
	Jack(11),
	Queen(12),
	King(13);

	int rank;
	private Rank(int r)
	{
		rank = r;
	}
	public int getRank()
	{
		return rank;
	}
	public String toString(Rank rank)
	{
		if(getRank() < 11)
		{
			return "Rank: " + getRank();
		}	
		else
		{
			return this.name();
		}
	}
}
