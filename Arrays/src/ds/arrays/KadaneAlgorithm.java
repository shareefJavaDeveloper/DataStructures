package ds.arrays;

public class KadaneAlgorithm {
	/**
	 * Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
	 * ---------------------------------
	 * @TimeComplexity - O(N)
	 * @SpaceComplexity - O(N)
	 * ---------------------------------
	 * @param array
	 */
	
	private static int maxSumOfSubarray(int[] array) {
		
		int currSum = 0;
		int maxSum = 0;
		
		for (int i = 0; i < array.length; i++) {
			currSum = currSum+array[i];
			if(currSum>maxSum)
				maxSum=currSum;
			if(currSum<0)
				currSum =0;
		}
		return maxSum;
		
	}
	

	public static void main(String[] args) {
		
		int[] array = {-2,-1,-4,-2,-6};
		
		int sum = maxSumOfSubarray(array);
		System.out.println(sum);
	}

	

}
