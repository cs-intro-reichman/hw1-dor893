// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int singleInteger = Integer.parseInt(args[0]);

		int ones = singleInteger % 10;

		int tens = (singleInteger / 10) % 10;

		int hundreds = singleInteger / 100;

		String output = hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.";

		System.out.println(output);
	}
}
