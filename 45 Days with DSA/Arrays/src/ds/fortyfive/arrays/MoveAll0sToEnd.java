package ds.fortyfive.arrays;

public class MoveAll0sToEnd {

	public static void main(String[] args) {
		
		int[] array = {1,0,2,5,0,0,0,0,7,8,0};
		int len = array.length;
		int start = 0;
		move0sToEnd(array,start,len);
	    for (int i : array) {
			System.out.println(i+ " ");
		}

	}

	private static void move0sToEnd(int[] array, int start, int len) {
		
		int low = start;
		int high = len-1;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[low]==0) {
				swap(array,low,high);
				high--;
			}else {
				low++;
			}
			
		}
		
	}

	private static void swap(int[] array, int low, int high) {
		
		int temp;
		temp = array[low];
		array[low]=array[high];
		array[high]=temp;
		
	}

}
