/* It is very important to "section" your code. Do 
not be scared to write more lines if it will make it more readable. 
the names of your variables should tell you what they are without looking 
what the right side of the equality says
For example instead of a1 name it aAsInt. better not name it a,b,c all together 
You could use more valuable names like randomNumber1, randomNumber2... etc
*/

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) 
	{
		int lim = Integer.parseInt(args[0]); // the limited rnange
		double a = Math.random()*lim; // first random number
		double b = Math.random()*lim; // seconed random number
		double c = Math.random()*lim; // third random number
		int a1 = (int)a; // changing to int
		int b1 = (int)b;  // changing to int
		int c1 = (int)c;  // changing to int
		System.out.println (a1 + " "+ b1 +" "+ c1 ); // print them in random order
		int max = Math.max((Math.max(a1, b1)), c1);  // finding the max number of 3
		int min = Math.min((Math.min(a1, b1)), c1);  // finding the min number of 3
		int midlle = (a1+b1+c1)-(max+min); // finding the midlle number by sums all of them, then minus the min+max numbers
		System.out.println (min + " "+ midlle +" "+ max ); // pring them in ascending order


	}
}

