package ds.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumWithoutDuplicates {
	
	//If we think about this case we can have a hashset and 
	//we can keep traversing through all the combinatons but we don't wanna store them if they are already exist
	
	//What if we dont pick the next possible same element to ignore the duplicate combination
	//Looping is one of the solution to do that
	//traverse through the indexes and ignore the same element and pick a[i+1]!=a[i]

	public static void main(String[] args) {
		
		int[] array = {1,1,1,2,2};
		
		int start = 0;
		
		int target = 4;
		
		List<List<Integer>> list = new ArrayList<>();
		
		List<Integer> ds = new ArrayList<>();
		
		combinationSum2(start,target,array,list,ds);
		
		System.out.println(list);

	}

	private static void combinationSum2(int start, int target, int[] array, List<List<Integer>> list, List<Integer> ds) {
		
		if(target==0) {
			list.add(new ArrayList<>(ds));
			return;
		}
		
		for (int i = start; i < array.length; i++) {
			
			if(i>start && array[i] == array[i-1]) continue;
			if(array[i]>target) break;
			
			ds.add(array[i]);
			combinationSum2(i+1, target-array[i], array, list, ds);
			ds.remove((Integer) array[i]);
			
		}
		
	}

}
