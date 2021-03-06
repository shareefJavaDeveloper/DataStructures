package ds.arrays;

public class ElementInASortedRotatedArray {
	/**
	 * Binary Search
	 * 1. array should be sorted -- incr/decr
	 * 2. array increasing and decreasing [2,5,7,20,13,10,5,1] max
	 * (Implementing)3. sorted array's that are rotated [3,4,5,6,1,2]
	 * 4. zigzaw format.
	 * ----------------------------------------------------------
	 * Find the  element from array which is rotated for n times
	 * @param array
	 * @param low
	 * @param high
	 * @param key
	 * @return
	 */
	private static int findElement(int[] array, int low, int high, int key) {
		
		if(low>high)
			return -1;
		
		if(low==high-1) {
			if(array[low]>array[high])
				return low;
			else
				return high;
		}
		
		int mid = (low+high)/2;
		
		if(array[mid]==key) {
			return mid;
		}
		
		if(array[low]<=array[mid]) {
			if(key >= array[low] && key <= array[mid]) 
				return findElement(array, low, mid-1, key);
			
			return findElement(array, mid+1, high, key);
		}
		
		if(key >= array[mid] && key <= array[high])
			return findElement(array, mid+1, high, key);	
		
		return findElement(array, low, mid-1, key);
	}
		
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6}; //{4,5,6,7,8,3,2,1};
		int low = 0;
		int high = array.length;
		int key = 6;
		int index = findElement(array,low,high-1,key);
		System.out.println(index);

	}
	
}
