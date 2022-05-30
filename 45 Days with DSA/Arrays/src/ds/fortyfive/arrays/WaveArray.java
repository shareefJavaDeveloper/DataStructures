package ds.fortyfive.arrays;

public class WaveArray {
	
	/**
	 * Wave array is a pattern where elements need to be swapped into wave like form.
	 * @param args
	 */

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5};
		
		int n = array.length;
		wave(array,n);
		
		for (int i : array) {
			System.out.print(i+ " ");
		}

	}

	private static void wave(int[] array, int n) {
		
		if(n%2==0) {
			for (int i = 0; i < n; i+=2) {
				swap(array,i,i+1);
			}
		}else {
			for (int i = 0; i < n-1; i+=2) {
				swap(array,i,i+1);
			}
		}
		
	}

	private static void swap(int[] array, int i, int j) {
		int temp;
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}

}
