// Luke Reissmueller
// CECS 277-01
// Prog 5 - Collections (map)
// 11/10/2020
// I certify that this program is my own original work. I did not copy any part of this program from
// any other source. I further certify that I typed each and every line of code in this program.
package map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Iterator;
import java.util.HashSet;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) throws Exception, InterruptedException
	{
		Scanner input = new Scanner(System.in);
		String inputFileName = "C:\\QWords.txt"; 
		System.out.println("Part 1: Using HashMap:");
		File inputFile = new File(inputFileName);
		
		Scanner scan = new Scanner(new File(inputFileName));
		long startTime = System.nanoTime();
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		
		while(scan.hasNext())
		{
			String word = scan.next();
			int i = getScrabble(word);
			hashmap.put(word, i);
		}
		scan.close();
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Time for loading into HashMap " + timeElapsed + " nano-seconds");
		
		startTime = System.nanoTime();
		for(Map.Entry<String, Integer> entry: hashmap.entrySet())
		{
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Time for printing Hashmap: " + timeElapsed + " nano-seconds");
		
		System.out.println("Press any key to continue...");
		input.next();
		
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		
		
		System.out.println("\nUsing TreeMap:");
		Scanner in = new Scanner(new File(inputFileName));
		startTime = System.nanoTime();
		Map<String, Integer> treemap = new TreeMap<String, Integer>();
		
		while(in.hasNext())
		{
			String word = in.next();
			Integer i = treemap.get(word);
			 if(i == null)
				 {
				 i = 1;
				 }
			 else
			 {
				 i += 1;
			 }
			treemap.put(word, getScrabble(word));
		}
		in.close();
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Time for loading into TreeMap: " + timeElapsed + " nano-seconds");
		
		startTime = System.nanoTime();
		for (Map.Entry<String, Integer> entry : treemap.entrySet()) 
		{
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Time for printing TreeMap: " + timeElapsed + " nano-seconds");
		
		System.out.println("Press any key to continue...");
		input.next();
		
		
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		
		
		inputFileName = "C:\\alice.txt"; 
		System.out.println("\nPart 2: Using HashSet:");
		inputFile = new File(inputFileName);
		startTime = System.nanoTime();
		HashSet<String> hashsetA = new HashSet<String>();
		scan = new Scanner(new File(inputFileName));
		while(scan.hasNext())
		{
			String word = scan.next();
			hashsetA.add(word);
		}
		scan.close();
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Elapsed time for loading hash set: " + timeElapsed + " nano-seconds");
	
		startTime = System.nanoTime();
		int size = hashsetA.size();
		Random random = new Random(size);
		int[] randInt = new int[100];
		int num = 0;
		for(int i = 0; i < 100; i++)
		{
			num = random.nextInt(size);
			randInt[i] = num;
		}
		Arrays.sort(randInt);
		ArrayList<String> ranWords = new ArrayList<String>();
		Iterator<String> iterator = hashsetA.iterator();
		num = 0;	
		for(int j = 0; j < 100; j++)
		{
			String word = iterator.next();
			if(num == j)
				{
				ranWords.add(word);
				
				}	
			num++;
		}
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Elapsed time for searching hashset: " + timeElapsed + " nano-seconds");
		
		System.out.println("Press any key to continue...");
		input.next();
		
		
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		
		
		System.out.println("\nUsing TreeSet:");
		in = new Scanner(new File(inputFileName));
		startTime = System.nanoTime();
		TreeSet<String> treesetA = new TreeSet<String>();
		
		while(in.hasNext())
		{
			String word = in.next();
			treesetA.add(word);
		}
		in.close();
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Elapsed time for loading tree set: " + timeElapsed + " nano-seconds");
		
		startTime = System.nanoTime();
		size = treesetA.size();
		random = new Random(size);
		randInt = new int[100];
		num = 0;
		for(int i = 0; i < 100; i++)
		{
			num = random.nextInt(size);
			randInt[i] = num;
		}
		Arrays.sort(randInt);
		ranWords = new ArrayList<String>();
		iterator = treesetA.iterator();
		num = 0;	
		for(int j = 0; j < 100; j++)
		{
			String word = iterator.next();
			if(num == j)
				{
				ranWords.add(word);
				
				}	
			num++;
		}
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Elapsed time for searching treeset: " + timeElapsed + " nano-seconds");
		
		System.out.println("Press any key to continue...");
		input.next();
		
		
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////

		
		System.out.println("\nPart 3: Using HashMap: ");
		inputFile = new File(inputFileName);
		scan = new Scanner(new File(inputFileName));
		startTime = System.nanoTime();
		hashmap = new HashMap<String, Integer>();
		
		while(scan.hasNext())
		{
			String word = scan.next();
			int i = getScrabble(word);
			hashmap.put(word, i);
		}
		scan.close();
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Time for loading into HashMap " + timeElapsed + " nano-seconds");
		
		startTime = System.nanoTime();
		int sum = 0;
		for(Map.Entry<String, Integer> entry: hashmap.entrySet())
		{
			sum += entry.getValue();
		}
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Time for printing HashMap of size " + hashmap.size() + " words: " + timeElapsed + " nano-seconds\nTotal scrabble value: " + sum);
		
		System.out.println("Press any key to continue...");
		input.next();
		
		
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////

		
		System.out.println("\nUsing TreeMap:");
		in = new Scanner(new File(inputFileName));
		startTime = System.nanoTime();
		treemap = new TreeMap<String, Integer>();
		
		while(in.hasNext())
		{
			String word = in.next();
			Integer i = treemap.get(word);
			 if(i == null)
				 {
				 i = 1;
				 }
			 else
			 {
				 i += 1;
			 }
			treemap.put(word, getScrabble(word));
		}
		in.close();
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Time for loading into TreeMap: " + timeElapsed + " nano-seconds");
		sum = 0;
		startTime = System.nanoTime();
		for (Map.Entry<String, Integer> entry : treemap.entrySet()) 
		{
			sum += entry.getValue();
		}
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Time for printing TreeMap of size " + treemap.size() + " words: " + timeElapsed + " nano-seconds\nTotal scrabble value: " + sum);
		
	}
	
	
	
	
	
	
	
	
	
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////
		//////////////////////////////

	
	
	
	public static int getScrabble(String word)
	{
		String s1 = "aeioulnrs";
		String s2 = "dg";
		String s3 = "bcmp";
		String s4 = "fhvwy";
		String s5 = "k";
		String s8 = "jx";
		String s10 = "qz";
		
		int tot = 0;
		for(int i = 0; i < word.length(); i++)
		{
			String current = Character.toString(word.charAt(i));
			if(s1.contains(current))
			{
				tot+=1;
			}
			if(s2.contains(current))
			{
				tot+=2;
			}
			if(s3.contains(current))
			{
				tot+=3;
			}
			if(s4.contains(current))
			{
				tot+=4;
			}
			if(s5.contains(current))
			{
				tot+=5;
			}
			if(s8.contains(current))
			{
				tot+=8;
			}
			if(s10.contains(current))
			{
				tot+=10;
			}
		}
		return tot;
	}

}
