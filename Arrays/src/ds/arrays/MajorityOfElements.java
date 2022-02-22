package ds.arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityOfElements {
	
	
	/**
	 * Find majority of elements(recurring more than half the size of array) using hashmap
	 * -----------------------
	 * @TimeComplexity - O(N)
	 * @SpaceComplexity - O(N)
	 * -----------------------
	 * @param array
	 * @return 
	 */
	private static void findMajorityOfElementsUsingHashMap(int[] array) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();		
		
		for (int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], (map.get(array[i])+1));
			}
			else
				map.put(array[i], 1);
		}
		
		int maxvalueOfMap = Collections.max(map.values());
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == maxvalueOfMap) {
				System.out.println(entry.getKey()+" is the key recurred for "+entry.getValue()+ " times");
			}
		}
	
		
	}
	
	/**
	 * Using Optimized way to use O(1) SpaceComplexity
	 * -----------------------------------------------
	 * @TimeComplexity - O(N)
	 * @SpaceComplexity - O(1)
	 *  -----------------------------------------------
	 * @param array
	 */
	private static void findMajorityOfElementsUsingOptimizedWay(int[] array) {
		int currentIndex =0 ;
		int count  = 1;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==array[currentIndex]) {
				count ++;
			}
			else
				count --;
			
			if(count==0)
				currentIndex = i;
				count = 1;
		}
		
		int countingRecurrence =0;
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]==array[currentIndex]) {
				countingRecurrence++;
			}
		}
			
			if(countingRecurrence==(array.length/2)) {
				System.out.println(array[currentIndex]);
			}
			else
				System.out.println("No element found that represent majority in array");
		
	}
	
	/**
	 * Majority of elements can be solved in multiple ways with different time and space complexitie's
	 * Will implement in multiple ways below
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1,2,4,1,2,2,2};
		
		System.out.println("----Using HashMap----");
		findMajorityOfElementsUsingHashMap(array);
		
		System.out.println();
		
		System.out.println("----Using Optimized way to use O(1) SpaceComplexity----");
		int[] arr = {1,2,3,2,3,1};
		findMajorityOfElementsUsingOptimizedWay(arr);
		
	}


}
