package ds.basic.math;

public class PalindromeOfANumber {

	public static void main(String[] args) {
		
		int number = 12321;
		
		System.out.println(checkForPalindromeBoolean(number));
		
//		int Result = checkForPalindrome(number);
//		
//		if(Result==number) {
//			System.out.println(number + " is a palindrome");
//		}else {
//			System.out.println(number +" is not a palindrome");
//		}

	}
	// using % and / operators
	private static int checkForPalindrome(int number) {
		int sum = 0;
		while(number!=0) {
			int r = number%10;
			
			sum = sum*10+r;
			
			number = number / 10;
			
		}
		System.out.println(sum);
		return sum;
	}
	
	//using two pointer approach
	private static boolean checkForPalindromeBoolean(int number) {
		
		String num = Integer.toString(number);
		char[] array = num.toCharArray();
		
		int low = 0;
		int high = array.length-1;
		
		while(low<high) {
			if(array[low]!=array[high]) {
				return false;
			}
			low++;
			high--;
		}
		
		return true;
	}

}
