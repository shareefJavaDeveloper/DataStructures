package ds.fortyfive.arrays;

public class Sort0s1s2sInAArray {

	public static void main(String[] args) {
		int array[] = {0,1,0,0,2,1,2,0,0,2,1,0};
		int n = array.length;
		sortArray(array,n);
		for (int i : array) {
			System.out.print(i+" ");
		}

	}

	private static void sortArray(int[] array, int n) {
		
		int low=0,mid=0,high=n-1;
		
		for (int i = 0; i < n; i++){
			if(mid>=high) return;
			if(array[mid]==1) {
				mid++;
			}
			else if(array[mid]==0) {
				swap(array,low,mid);
				low++;
				mid++;
			}
			else {
				swap(array,high,mid);
				high--;
			}
		}
		
	}
	
	private static void swap(int[] array, int l, int r) {
		int temp;
		temp = array[l];
		array[l]=array[r];
		array[r]=temp;
	}

}
