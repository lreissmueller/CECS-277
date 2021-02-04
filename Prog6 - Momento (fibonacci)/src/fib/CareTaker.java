package fib;
import java.util.*;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();
	public void add(Memento m) {
		mementoList.add(m);
	}
	public Memento get(int i) {
		return mementoList.get(i);
	}
	public int listSize()
	{
		return mementoList.size();
	}
}
