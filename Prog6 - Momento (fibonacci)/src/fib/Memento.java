package fib;
import java.math.BigInteger;

public class Memento 
{
	private BigInteger number;
	public Memento(BigInteger num) 
	{
		number = num;
	}
	public BigInteger getNum()
	{
		return number;
	}
	public String toString() 
	{
		return ("Memento Int: " + number);
	}
}
