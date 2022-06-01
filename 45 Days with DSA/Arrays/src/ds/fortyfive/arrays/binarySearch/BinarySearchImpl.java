package ds.fortyfive.arrays.binarySearch;

public class BinarySearchImpl {
	
	/**
	 * Binary Search algo is used on sorted array/arrays which are first increasing and then decreasing or vice versa.
	 * @param args
	 */

	public static void main(String[] args) {
		
		int array[] = {2,4,6,8,10,13,14,16};
		int high = array.length-1;
		int start = 0;
		int search = 9;
		System.out.println(binarySearch(array, start,high,search));
	}
	
	private static int binarySearch(int array[] ,int start, int high,int search) {
		
		int mid = (start+high)/2;
		
		if(array[mid]==search) {
			return mid;
		}
		if(start==high) {
			return start;
		}
		if(start==high-1) {
			if (array[start]==search) {
				return start;
			}
			else
				return high;
		}
		if(array[mid]>search) {
			return binarySearch(array, start, mid-1, search);
		}
		else {
			return binarySearch(array, mid+1, high, search);
		}

	}

}
