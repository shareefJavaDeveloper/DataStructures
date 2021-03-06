package ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class PairOfElements_In_A_Array_EqualToSum {
	
	/**
	 * Find the pair of elements whose sum are equal to passed sum value
	 * -----------------------------------------------------------------
	 * @TimeComplexity - o(N)
	 * @SpaceComplexity - o(N)
	 * -----------------------------------------------------------------
	 * @param array
	 * @param length,sum
	 * @return
	 */ 
	private static void findPairOfElements(int[] array, int length , int sum) {
		
		Map<Integer,Integer> hash = new HashMap<>();
		
		for(int i=0;i<length;i++)
			hash.put(array[i], i);
		
		for (int i = 0; i < length; i++) {
			if(hash.containsKey(sum-array[i])) {
				System.out.println(array[i]+" "+(sum-array[i]));
			}
		}

	}

	public static void main(String[] args) {
		int[] array = {2,5,3,4,7,8,9};
		int length = array.length;
		int sum = 15;
		findPairOfElements(array ,length ,sum);

	}


}
