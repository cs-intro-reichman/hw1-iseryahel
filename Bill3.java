/* again. Separate your code*/


// Splits a restaurant bill evenly among three diners.
public class Bill3
{
		public static void main(String[] args)
	 {
	    String name1 = args[0]; // first name
		String name2 = args[1]; // seconed name
		String name3 = args[2]; // third name
		int sum = Integer.parseInt(args[3]); // the bill value
		double share = sum/  3.0 ; // how much each should pay
		share = Math.ceil(share); // round up the share
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": " + "pay " + share + " Shekels each.");
	}
}
