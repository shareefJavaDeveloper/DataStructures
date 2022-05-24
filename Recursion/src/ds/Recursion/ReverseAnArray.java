package ds.Recursion;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,9,8,7,6};
		int l=0;
		int r = array.length-1;
		int[] reverse = reverseGivenArray(l,r,array);
		System.out.print("[ ");
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]+ ",");
		}
		System.out.print(" ]");

	}

	public static int[] reverseGivenArray(int l, int r, int[] array) {

		int temp;
		if (l>=r) return array;
		temp = array[l];
		array[l]=array[r];
		array[r]=temp;
		
		reverseGivenArray(l+1, r-1, array);
		return array;
	}

}
