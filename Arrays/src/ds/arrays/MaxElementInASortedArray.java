package ds.arrays;

public class MaxElementInASortedArray {
	/**
	 * Binary Search
	 * 1. array should be sorted -- incr/decr
	 * (Implementing)2. array increasing and decreasing [2,5,7,20,13,10,5,1] max
	 * 3. sorted array's that are rotated [3,4,5,6,1,2]
	 * 4. zigzaw format.
	 * ----------------------------------------------------------
	 * Find the Max element from array which is first increased and then decreased
	 * @param array
	 * @param low,high
	 * @TimeComplexity - O(N)
	 * @SpaceComplexity - O(1)
	 */
	private static int maxElementInASortedArray(int[] array, int low, int high) {
		
		if(low>high) {
			return -1;
		}
		if(low==high) {
			return array[low];
		}
		if(high==low+1) {
			if(array[low]>array[high])
				return array[high];
			else
				return array[low];
		}
		
		int mid = (low+high)/2;
		if(array[mid]>array[mid+1]&&array[mid]>array[mid-1])
			return array[mid];
		if(array[mid]>array[mid-1]&&array[mid]<array[mid+1])
			return maxElementInASortedArray(array, mid+1, high);
		else
			return maxElementInASortedArray(array, low, mid-1);
		
	}
	
	public static void main(String[] args) {
		
		int[] array = {3,5,8,12,3,5};
		int low = 0;
		int high = array.length;
		int index = maxElementInASortedArray(array,low,high-1);
		System.out.println(index);

	}

}
