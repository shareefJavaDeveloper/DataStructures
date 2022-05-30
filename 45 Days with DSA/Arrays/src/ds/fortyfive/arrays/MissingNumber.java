package ds.fortyfive.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] array = {6,4,3,2,1,5,7,9};
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
