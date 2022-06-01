package ds.fortyfive.arrays;

public class RemoveDuplicatesFromAnrray {
	
	/**
	 * Given an sorted array to remove duplicates from it.
	 * -----------------------
	 * @TimeComlpexity - O(n)
	 * @SpaceComplexity - O(1)
	 * -----------------------
	 */
	
	public static void main(String[] args) {
		int array[] = {1,2,2,3,4,6,6,7};
		int len = array.length;
		int start = 0;
		
		int index = removeDuplicates(array,start,len);
		
		for (int i = 0; i < index; i++) {
			System.out.println(array[i]);
		}
	}

	private static int removeDuplicates(int[] array, int start, int len) {
		int j =0;
		
		if(len==0||len==1)
			return len;
		
		for (int i = 0; i < len-1; i++) {
			if(array[i]!=array[i+1]) {
				array[j]=array[i];
				j++;
			}
		}
			array[j++] = array[len-1];
			
		return j;
		
	}

}
