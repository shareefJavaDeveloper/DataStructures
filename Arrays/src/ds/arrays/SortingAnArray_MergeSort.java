package ds.arrays;

public class SortingAnArray_MergeSort {
	/**
	 * 
	 * @param array
	 * @param result
	 * @param low
	 * @param high
	 * @return
	 */
	private static void mergeSort(int[] array, int[] result, int low, int high) {
		
		if(low==high) {
			return ;
		}
		
		int mid = (low+high)/2;
		
		mergeSort(array, result, low, mid);
		mergeSort(array, result, mid+1, high);
		merge(array,result,low,mid,high);
	}
	
	/**
	 * 
	 * @param array
	 * @param result
	 * @param low
	 * @param mid
	 * @param high
	 */
	private static void merge(int[] array, int[] result, int low, int mid, int high) {
		
		int k=low; int i = low; int j = mid+1;
		
		while(i<=mid && j<= high) {
			if(array[i]<= array[j]) {
				result[k++] = array[i++];
			}
			else
				result[k++] = array[j++];
		}
		
		while(i<=mid) {
			result[k++]=array[i++];
		}
		while(j<=high) {
			result[k++]=array[j++];
		}
		for(i=low;i<=high;i++) {
			array[i]=result[i];
		}
	}

	public static void main(String[] args) {
		
		int[] array = {3,9,6,4,15,2,1};
		int length = array.length;
		int[] result= new int[length];
		
		mergeSort(array ,result,0,length-1);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		

	}

	

}
