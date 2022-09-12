package ds.basic.math;

public class FactorialOfANumber {

	public static void main(String[] args) {
		
		int number = 10;
		
		int result = factorial(number);
		
		System.out.println(result);

	}

	private static int factorial(int number) {
		if(number==0) {
			return 1;
		}
		
		return number*factorial(number-1);
	}

}
