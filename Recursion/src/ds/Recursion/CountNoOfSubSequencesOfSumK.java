package ds.Recursion;

public class CountNoOfSubSequencesOfSumK {
	
	static int k = 2;
	public static void main(String[] args) {
		
		int start = 0;
		int sum = 0;
		int[] array = {1,2,1};
		int n = 3;
		System.out.println(countOfSubSequenceSum(start,array,sum,n));

	}
	private static int countOfSubSequenceSum(int start, int[] array, int sum,int n) {
		
		if(start==n) {
			
			if(sum==k) {
				return 1;
			}
			else
				return 0;
		}
		
		sum += array[start];
		
		int l = countOfSubSequenceSum(start+1, array, sum, n);
		
		sum -= array[start];
		
		int r = countOfSubSequenceSum(start+1, array, sum, n);

		return l+r;
		
	}

}
