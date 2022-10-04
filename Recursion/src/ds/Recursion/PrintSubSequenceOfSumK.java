package ds.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSequenceOfSumK {
	
	static int k = 2;
	
	public static void main(String[] args) {
		
		int start = 0;
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		int[] array = {1,2,1};
		int n = 3;
		
		sumOfSubSequence(start,list,sum, array,n);
	}

	private static void sumOfSubSequence(int start, List<Integer> list, int sum, int[] array,int n) {
		
		if(start==n) {
			if(sum == k) {
				System.out.println(list);
			}
			return;
		}
		
		list.add(array[start]);
		sum = sum + array[start];
		sumOfSubSequence(start+1, list, sum, array,n);
		list.remove((Integer) array[start]);
		sum = sum - array[start];
		sumOfSubSequence(start+1, list, sum, array,n);
		
	}

}
