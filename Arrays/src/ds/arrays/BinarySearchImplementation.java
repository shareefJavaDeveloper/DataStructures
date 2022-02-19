package ds.arrays;

public class BinarySearchImplementation {
	
	/**
	 * Implementation of binary search algorithm(for decreasing Order).
	 * -----------------------------------------
	 * @TimeComplexity - O(log(n))
	 * @SpaceComplexity - O(1)
	 * -----------------------------------------
	 * @param array
	 * @param i
	 * @param j
	 * @param key 
	 * @return
	 */
	private static int binarySearch(int[] array, int low, int high, int key) {
		
		if(low>high) {
			return -1;
		}
		if(low==high) {
			return low;
		}
		if(high == low+1) {
			if(array[low]==key) {
				return low;
			}
			else
				return high;
		}
		
		int mid = (low+high)/2;
		
		if(array[mid]>key) {
			return binarySearch(array, mid+1,high, key);
		}
		else
			return binarySearch(array,low , mid-1, key);
		
	}

	public static void main(String[] args) {
		
		int[] array = {10,8,7,4,2,1};
		int length = array.length;
		int key = 4;
		int index = binarySearch(array,0,length-1,key);
		System.out.println(index);
	}

}
