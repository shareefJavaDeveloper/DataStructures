package ds.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		int array[] = {1,2,1};
		
		int start = 0;
		
		int target = 2;
		
		List<Integer> list = new ArrayList<>();
		
		subSequenceSum(start,target,array,list);
		
		}

	private static void subSequenceSum(int start, int target, int[] array, List<Integer> list) {
		
		if(start==array.length) {
			if(target == 0) {
				System.out.println(list);
				return;
			}	
			return;
		}
		
		if(target==0) {
			System.out.println(list);
			return;
		}
		
		if(array[start]<=target) {
		list.add(array[start]);
		subSequenceSum(start+1, target-array[start], array, list);
		list.remove(array[start]);
		}
		subSequenceSum(start+1, target, array, list);
		
	}

}
