package ds.arrays;

public class FindMinOfUnsortedArray {

	public static void main(String[] args) {
		
		
		int[] array = {2,5,21,7,9,8,1};
		
		int length = array.length;
		
		int min = findMinOfArray(array, length);
		
		System.out.println(min);

	}
	
	/**
	 * Find the minimum of an array in unsorted array.
	 * ----------------------------------------------
	 * @TimeComplexity - O(N)
	 * @SpaceComplexity - O(1)
	 * ----------------------------------------------
	 * @param array
	 * @param length
	 * @return min
	 */
	private static int findMinOfArray(int[] array, int length) {
		
		int min = array[0];
		
		for (int i = 0; i <= length-1; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		return min;
	}

}
