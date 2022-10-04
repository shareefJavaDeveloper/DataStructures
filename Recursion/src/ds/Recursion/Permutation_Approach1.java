package ds.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Approach1 {
		
	
		//permutation will give n! patterns
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3};
		
		boolean[] mark = new boolean[array.length]; //used for marking taken places
		
		List<Integer> ds = new ArrayList<Integer>(); //used to hold the pattern
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		
		int start = 0;
		
		permute(start,array,mark,ds,ans);
		
		System.out.println(ans);

	}

	private static void permute(int start, int[] array, boolean[] mark, List<Integer> ds, List<List<Integer>> ans) {
		
		//base case is very simple just return/print when ever size is array.length
		if(ds.size()==array.length) {
			ans.add(new ArrayList<>(ds));
		}
		
		for (int i = 0; i < mark.length; i++) {
			
			if(!mark[i]) {
				ds.add(array[i]);
				mark[i] = true;
				permute(start+1,array, mark, ds,ans);
				ds.remove((Integer) array[i]);
				mark[i] = false;
			}
			
		}
		
		
		
	}

}
