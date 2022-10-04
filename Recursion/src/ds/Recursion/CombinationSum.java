package ds.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	//Find the sum in array can pick the same index multiple times here.
	public static void main(String[] args) {
		
		int array[] = {2,2,3,7};
		int start = 0;
		int target = 7;
		List<Integer> list = new ArrayList<>();
		combinationSum(start,array,target,list);

	}

	private static void combinationSum(int start, int[] array, int target,List<Integer> list) {
		
		if(start==array.length) {
			if(target==0) {
				System.out.println(list);
				return;
			}
			else return;
		}
		
		
		if(array[start]<=target) {
			list.add(array[start]);
			combinationSum(start, array, target-array[start], list);
			list.remove(list.size()-1);
		}
		
		combinationSum(start+1, array, target, list);
		
	}

}
