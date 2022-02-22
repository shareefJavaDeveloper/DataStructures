package ds.arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MoveAllNonNegitveToTheBegining {
	
	/**
	 * Move all the -ve elements to the front part of the array in O(1) space complexity
	 * ---------------------------------------------
	 * @TimeComplexity - O(N)
	 * @SpaceComplexity - O(1)
	 * ---------------------------------------------
	 * @param array
	 */
	private static void moveAllNonNegitiveToTheBegining(int[] array) {
		int i = 0;
		int j = 0;
		int temp;
		for (int k = 0; k < array.length; k++) {
			
			if(array[k]<0) {
				temp = array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j++;
			}
			else
				j++;
			
		}
		
		
	}
	
	/**
	 * Using sorted set to get sorted elements in an array(Will not work if duplicate elements are present).
	 * --------------------------
	 * @TimeComplexity - O(N)
	 * @SpaceComplexity - O(N)
	 * --------------------------
	 * @param array
	 */
	private static void usingHashSet(int[] arr) {
		
		SortedSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
		set.add(arr[i]);
		}
		for (Integer integer : set) {
			System.out.print(integer+" ");
		}
		
	}

	public static void main(String[] args) {
		int[] array = {-1,-1,3,-1,-7,-5};
		
		moveAllNonNegitiveToTheBegining(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		int[] arr = {2,-5,3,-1,-4}; //Sorted Set will not work for duplicate values{-1,-1,3,-1,-7,-5};
		usingHashSet(arr);

	}

	

}
