package ds.arrays;

public class JumpingGameProblem {
	
	/**
	 * You have an array of non-negative integers,you are initially positioned at the first index of the array.
	 * Each element in the array represents your maximum jump length at that position.
	 * Determine if you are able to reach the last index.
	 * --------------------------------------------------
	 * @TimeComplexity - O(N)
	 * @SpaceComllexity - O(1)
	 * --------------------------------------------------
	 * @param array 
	 * @param length 
	 * @return 
	 */
	private static int findMinNoOfJumps(int[] array, int length) {
		
		//Initially positioned at first index.
		int a = array[0];
		int b = array[0];
		
		//first jump should be 1
		int jump = 1;
		
		for (int i = 0; i < length; i++) {
			
			if(i<length-1)
			{
				a--;
				b--;
			}
			if(array[i]>b)
				b = array[i];
			
			if(a==0) {
				a=b;
				//System.out.println("At index :"+i);
				jump++;
				//System.out.println(jump);
			}
		}
		
		
		
		return jump;
		
		
	}
	
    public static void main(String[] args) {
		
    	int[] array = {1,1,1,2,4,6};
    	int length = array.length;
		int jumps = findMinNoOfJumps(array , length);
        System.out.println("Minimum required jumps are: " +jumps);
	}

}
