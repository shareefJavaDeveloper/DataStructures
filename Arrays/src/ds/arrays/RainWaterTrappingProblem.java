package ds.arrays;

public class RainWaterTrappingProblem {
	
	/**
	 * N non-negative integers representing an elevation map where the width of each bar is 1. 
	 * Write an algorithm to find how much water it is able to trap after raining 
	 * -----------------------
	 * @TimeComplexity - O(n)
	 * @SpaceComplexity - O(n)
	 * ----------------------- 
	 * @param array
	 * @param length
	 * @return
	 */
	private static int findSumOftrappedWaterBlocks(int[] array, int length) {
		
		int[] leftArray = new int[length];
		int[] rightArray = new int[length];
		leftArray[0] = array[0];
		for (int i = 1; i < array.length; i++) {
			leftArray[i] = Math.max(leftArray[i-1], array[i]);
			
			
		}
		
		rightArray[length-1] = array[length-1];
		
		for (int i = length-2; i >= 0; i--) {
			rightArray[i] = Math.max(rightArray[i+1], array[i]);
			
		}
		
		int sum =0;
		for (int i = 0; i < array.length; i++) {
			
			sum += Math.min(leftArray[i], rightArray[i])-array[i];
			
		}
		
		
		return sum;
	}

	public static void main(String[] args) {
		
		int[] array = {3,1,2,4,0,1,3,2};
		
		int length = array.length;
		//System.out.println(length);
		int sumOftrappedWaterBolcks = findSumOftrappedWaterBlocks(array, length);
		System.out.println(sumOftrappedWaterBolcks);
	}

}
