// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		double currentValue = Double.parseDouble(args[0]);

		double rate = Double.parseDouble(args[1]) / 100;

		double years = Double.parseDouble(args[2]);

		double futureValue = currentValue * Math.pow((1 + rate), years);

		String output = "After " +  (int)years + " years, $" + (int)currentValue + " saved at " + (rate * 100) + "% will yield $" + (int)futureValue;
		
		System.out.println(output);

	}
}