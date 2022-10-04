package ds.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstSubSequenceOfSumK {
	static int k =2;
	public static void main(String[] args) {
		int start = 0;
		int[] array = {1,2,1};
		int n = 3;
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		
		firstSubSequenceOfSum(start,array,list,n,sum);
	}

	private static boolean firstSubSequenceOfSum(int start, int[] array, List<Integer> list, int n, int sum) {
		
		if(start==n) {
			
			if(sum==k) {
				System.out.println(list);
				return true;
			}
			
			else
			return false;
		}
		
		list.add(array[start]);
		sum += array[start];
		if(firstSubSequenceOfSum(start+1, array, list, n, sum)==true) return true;
		list.remove((Integer) array[start]);
		sum -= array[start];
		if(firstSubSequenceOfSum(start+1, array, list, n, sum)==true) return true;
		
		
		return false;
		
	}

}
