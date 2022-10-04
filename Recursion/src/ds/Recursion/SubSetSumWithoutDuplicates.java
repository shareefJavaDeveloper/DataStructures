package ds.Recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubSetSumWithoutDuplicates {
	
	public static void main(String[] args) {
	
	int[] array = {1,2}; //If not sorted have to sort it first.
	
	int start = 0;
	
	List<Integer> ds = new ArrayList<Integer>();
	
	List<List<Integer>> ans = new ArrayList<List<Integer>>();
	
	subSets(start,array,ds,ans);
	
	for (List<Integer> list : ans) {
		System.out.println(list);
	}
	
	}

	private static void subSets(int start, int[] array, List<Integer> ds, List<List<Integer>> ans) {
		
			ans.add(new ArrayList<>(ds));
		
		for (int i = start; i < array.length; i++) {
			
			if(i!=start && array[i] == array[i-1]) continue;
			
			ds.add(array[i]);
			subSets(start+1, array, ds, ans);
			ds.remove(ds.size()-1);
			
		}
		
		
		
	}

}
