package ds.Recursion;

public class FactorialOfNumber {
	
	/**
	 * Finding factorial of a number using recursion
	 * ---------------------------------------------
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		int number = 0;
		
		if(number>=0) {
			System.out.println(factorial(number));
		}else {
			System.out.println("Not a positive integer or 0!");
		}
		
	}

	private static int factorial(int number) {
		if(number==0) {
			return 1;
		}
		else {
			int partial_Ans = factorial(number-1);
			return number * partial_Ans;
		}
	}

}
