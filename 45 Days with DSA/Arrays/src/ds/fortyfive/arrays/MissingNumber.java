package ds.fortyfive.arrays;

public class MissingNumber {
	/**
	 * Given an array of numbers which are NATURAL/WHOLE i.e starting from 1
	 * @param args
	 */

	public static void main(String[] args) {
		
		int[] array = {1,2,3,5,6,7};
		int n = array.length;
		
		System.out.println(missingNum(array,n));

	}

	private static int missingNum(int[] array, int n) {
		int m = n+1;
		
		int total = m*(m+1)/2;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum+array[i];
		}
		return total-sum;
	}

}
