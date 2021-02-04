// Luke Reissmueller
// CECS 277-01
// Prog 4 - File IO
// 10/27/2020
// I certify that this program is my own original work. I did not copy any part of this program from
// any other source. I further certify that I typed each and every line of code in this program.
package fileio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in); 	  //init scanner
		System.out.print("Enter filename: ");     //print
		String inputFileName = scan.next();       //ask file name
		File inputFile = new File(inputFileName); //create file
		Scanner in = new Scanner(inputFile);      //load file to scanner
		String inLine = in.nextLine();            //skip first line
		int rateCount = 0;						  //init commercial rate count for denominator in average
		double rateSum = 0;						  //init commercial rate sum for numerator in average
		double rateH = 0;					  	  //init highest commercial rate num
		double rateL = 1;					 	  //init lowest commercial rate num
		String compH = "";					  	  //init company of highest commercial rate
		String compL = "";					  	  //init company of lowest commercial rate
		String zipH = "";						  //init zip of commercial high 
		String zipL = "";						  //init zip of commercial low
		String stateH = "";						  //init state of commercial high
		String stateL = "";						  //init state of commercial low
		//C:\\Users\\Luke\\Desktop\\rates.csv <-Personal path(test)
							  
		while(in.hasNextLine())
		{
			inLine = in.nextLine();				   //advance lines
			String[] lineSplit = inLine.split(",");//array to split lines 
			String zip = lineSplit[0];			   //init zip
			String comp = lineSplit[2];			   //init company
			String state = lineSplit[3];		   //init state
			double rate = Double.valueOf(lineSplit[6]); //init rate
			rateSum += rate;
			rateCount += 1;
			
			if(rate > rateH) 					   //high conditional
			{
				rateH = rate;
				compH = comp;
				zipH = zip;
				stateH = state;
			}
			if(rate < rateL)					   //low conditional
			{
				rateL = rate;
				compL = comp;
				zipL = zip;
				stateL = state;
			}
		}
		System.out.println("The average commercial rate is: " + (rateSum/rateCount) + 
				"\n\nThe highest rate is:\n" + compH + " " + "(" + zipH + ", " + stateH + ") - $" + rateH + 
				"\n\nThe lowest rate is:\n" + compL + "(" + zipL + ", " + stateL + ") - $" + rateL);
	
		
		scan.close();
		in.close();
	}	
}
