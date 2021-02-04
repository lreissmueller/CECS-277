package fib;
import java.math.BigInteger;

public class Originator 
{
	private BigInteger num;
	public Originator(BigInteger n) 
	{
		num = n;
	}
	public Memento saveStatetoMemento() 
	{
		return new Memento(num);
	}
	public void setNum(BigInteger n) 
	{
		num = n;
	}
	public BigInteger getStateFromMemento(Memento m) 
	{
		num = m.getNum();
		return num;
	}
	public String toString() 
	{
		return ("Integer: " + num);
	}
}
