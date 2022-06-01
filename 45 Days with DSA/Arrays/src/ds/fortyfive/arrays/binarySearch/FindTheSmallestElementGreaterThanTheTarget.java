package ds.fortyfive.arrays.binarySearch;

public class FindTheSmallestElementGreaterThanTheTarget {

	public static void main(String[] args) {
		
		int array[] = {2,3,4,5,6,7,8,9,16};
		
		int start = 0;
		int high = array.length-1;
		int target = 6;
		int ans = binarySearch(array,start,high,target);
		System.out.println(ans);
	}

	private static int binarySearch(int[] array, int start, int high, int target) {
		
	while(start<=high) {
		int mid = (start+(high-start))/2;
		if(array[mid]==target) return mid+1;
		else if(array[mid]>target) high=mid-1;
		else start = mid+1;
	}
	return start+1;
	}

}
