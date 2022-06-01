package ds.fortyfive.arrays;

public class RightAndLeftOfArray {
	
	/**
	 * Find the element which contains all the elements left to it are small and all the elements right
	 * to it are large.
	 * @param args
	 */

	public static void main(String[] args) {
		int array[] = {6,3,2,5,8,11,9,10};
		int length = array.length;
		int index = findElement(array,length);
		System.out.println(index);
	}

	private static int findElement(int[] array, int length) {

		int left[] = new int[length];
		left[0]  = Integer.MIN_VALUE;
		int index=-1;
		
		for (int i = 1; i < left.length; i++) {
			left[i]=Math.max(array[i-1], left[i-1]);
		}
		int right = Integer.MAX_VALUE;
		for (int i = length-1; i >= 0; i--) {
			if(left[i]<array[i] && right>array[i]) {
				return i;
			}
			right = Math.min(array[i], right);
		}
		
		
		return index;
	}

}
