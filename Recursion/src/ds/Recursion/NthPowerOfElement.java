package ds.Recursion;

public class NthPowerOfElement {
	
	/**
	 * Finding Nth power of an element using recursion
	 * -----------------------------------------------
	 * @param args
	 */

	public static void main(String[] args) {
		
		int element = 2;
		int n = 3;
		
		System.out.println(power(element,n));

	}

	private static long power(int element, int n) {
			
		/**
		 * With TimeComplexity O(n)
		 */
//			if(n==0) return 1;
//			long partial_Ans = power(element, n-1);
//			return element * partial_Ans;
		
		/**
		 * With TimeComplexity O(log(n))
		 */
		
		if(n==0) return 1;
		long partial_Ans = power(element,n/2);
		if(n%2==1) return partial_Ans*partial_Ans*element;
		return partial_Ans*partial_Ans;
	}

}
