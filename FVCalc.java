// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args)
	{
		int CurrentValue = Integer.parseInt(args[0]); // invested sum
		double intrest = Double.parseDouble(args[1]) ; // the inrest
		int years = Integer.parseInt(args[2]); // the number of years
		double years2 =(double) years; // changing the years to double for the math.pow function
		double Newintrest = intrest/100; // changing the inrest to a number to work with
		double feuture = CurrentValue*(Math.pow(Newintrest+1,years2)); // the function that calculte the future value
		System.out.println("After " + years + " years, " + "$"+CurrentValue + "saved at " + intrest + "% " + "will yield " +"$"+ ((int)feuture));



		

		
	}
}