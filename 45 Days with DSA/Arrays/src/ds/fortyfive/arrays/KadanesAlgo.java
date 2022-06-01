package ds.fortyfive.arrays;

public class KadanesAlgo {
	
	/**
	 * Kadane's algo if all the elements are not negative in an array.
	 * @param args
	 */
	
	public static void main(String[] args) {
		int array[] = {1,2,-3,4,5};
		int length = array.length;
		int sum = kadane(array,length);
		System.out.println(sum);

	}

	private static  int kadane(int[] array, int length) {
		
		int currSum = 0;
		int maxsum =0;
		for (int i = 0; i < length; i++) {
			currSum = currSum+array[i];
			if(currSum>=maxsum) {
			maxsum=currSum;
			}
			
			if(currSum<0) {
				currSum=0;
			}
		}
		
		return currSum;
		
	}

}
