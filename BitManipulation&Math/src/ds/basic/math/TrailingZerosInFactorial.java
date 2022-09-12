package ds.basic.math;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		
		
		//pattern follows divide the number with multiple of 5 to get the trailing zeros
		
		int number = 10;
		
		int res =0 ;
		for (int i = 5; i <= number; i=i*5) {
			res = res + (number/i);
		}
		
		System.out.println(res);
		

	}

}
