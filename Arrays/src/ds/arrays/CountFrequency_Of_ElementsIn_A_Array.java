package ds.arrays;

import java.util.HashMap;
import java.util.Map;


public class CountFrequency_Of_ElementsIn_A_Array {
	
	/**
	 * Count the Frequency of elements in array
	 * ----------------------------------------
	 * @TimeComplexity - O(N)
	 * @SpaceComplexity - O(N)
	 * ----------------------------------------
	 * @param array
	 * @param length
	 */
	private static void countFrequency(int[] array, int length) {
		
		Map<Integer,Integer> hash = new HashMap<>();
		
		for (int i = 0; i < length; i++) {
			if(hash.containsKey(array[i])) {
				hash.put(array[i], (hash.get(array[i])+1));
			}
			else
				hash.put(array[i], 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : hash.entrySet()) {
			System.out.println(entry.getKey()+" -->  "+entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		
		int[] array = {1,1,1,4,2,4,3,2,1};
		
		int length = array.length;
		countFrequency(array,length);

	}


}
