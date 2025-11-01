// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[])
	 {
		int num = Integer.parseInt(args[0]);
		double hundreds = num/100; // getting the hundreds nbmber
		double tens = num/10 - (num/100 * 10); // remove the ones from the number and then remove the hundrends number
		int ones = num-(100*(int)hundreds) - (int)tens*10; // remove the hundreds and then the tens
		System.out.println( (int)hundreds + " hundreds, " + (int)tens + " tens, and " + (int)ones  + " ones." );
		
	}
}
