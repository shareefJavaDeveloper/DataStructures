package ds.arrays;

public class ElementInASortedArray {
	
	/**
	 * Binary Search
	 * (implementing)1. array should be sorted -- incr(implemented)/decr
	 * 2. array increasing and decreasing [2,5,7,20,13,10,5,1] max
	 * 3. sorted array's that are rotated [3,4,5,6,1,2]
	 * 4. zigzaw format.
	 * ----------------------------------------------------------
	 * Find the given element index in an array using binarysearch
	 * @TimeComplexity - O(logn)
	 * @SpaceComplexity - O(1)
	 * @param array
	 * @param low,high,element
	 * @return index
	 */
	private static int SearchForElement(int[] array,int low, int high,int element) {
		
		if(low>high) {
			return -1;
		}
		
		int mid = (low+high)/2;
		if(array[mid]==element) {
			return mid;
		}
		else if(array[mid]>element)
			return SearchForElement(array, low, mid-1, element);
		else
			return SearchForElement(array, mid+1, high, element);
		
	}

	public static void main(String[] args) {
		int[] array = {2,4,5,7,8,11,56,86};
		int size = array.length;
		int element = 4;
		int index = SearchForElement(array,0,size-1,element);
		System.out.println(index);
	}

}
