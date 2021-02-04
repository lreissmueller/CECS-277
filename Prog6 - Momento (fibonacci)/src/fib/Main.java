// Luke Reissmueller
// CECS 277-01
// Prog 6 - Memento (fibonacci)
// 11/24/2020
// I certify that this program is my own original work. I did not copy any part of this program from
// any other source. I further certify that I typed each and every line of code in this program.
package fib;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) 
    {
        long startTime;
        long endTime;
        double time;
        BigInteger f = new BigInteger("1");
        for(int i = 0; i <= 1000; i++)
        {
            startTime = System.currentTimeMillis();
            f = fibo(i);
            endTime = System.currentTimeMillis();
            time = (endTime - startTime)/1000.0;
            System.out.printf("Fibo(%d): %12d (Secs: %5.3f)\n",i,f, time);
            		}
    }
		public static CareTaker nums = new CareTaker(); 
		public static BigInteger fibo(int n)
		{
		    BigInteger N = BigInteger.valueOf(n);
		    Originator oNum = new Originator(N);
		    oNum.setNum(N);
		    BigInteger sum = BigInteger.valueOf(0);
		    if (n == 0)
		    {  
		        nums.add(oNum.saveStatetoMemento());
		        return sum;
		    }
		    else if(n == 1)
		    {
		        nums.add(oNum.saveStatetoMemento());
		        sum = BigInteger.valueOf(1);
		        return sum;
		    }
		    else if(nums.listSize() > n)
		    {
		        return nums.get(n).getNum();
		    }
		        oNum.setNum(BigInteger.valueOf(n)); 
		        sum = (oNum.getStateFromMemento(nums.get(n - 2)).add(oNum.getStateFromMemento(nums.get(n-1))));
		        Memento tempSum = new Memento(sum);
		        nums.add(tempSum);
		        return sum;      
		}     
}