package ds.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubSetSum {
	
	//Print all the sums of subsets in increasing order
	
	static List<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		int start = 0;
		int[] array = {3,2,1};
		int length = array.length;
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		
		subSet_Sum(start,array,length,sum,list);
		
		Collections.sort(result);
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}

	private static void subSet_Sum(int start, int[] array, int length, int sum, List<Integer> list) {
		
		if(start>=length) {
			result.add(sum);
			return;
		}
		
		list.add(array[start]);
		sum += array[start];
		
		subSet_Sum(start+1, array, length, sum, list);
		
		list.remove((Integer) array[start]);
		sum -= array[start];
		
		subSet_Sum(start+1, array, length, sum, list);
		
	}

}
