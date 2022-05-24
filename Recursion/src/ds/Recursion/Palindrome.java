package ds.Recursion;

public class Palindrome {
	
	public static void main(String[] args) {
		String string = "RADAR";
		int l=0;
		int r = string.length()-1;
		System.out.println(isPalindrome(l,r,string));
	}

	private static boolean isPalindrome(int l, int r, String string) {
		
		if (l==r) return true;
		if (string.charAt(l)!=string.charAt(r)) return false;
		return isPalindrome(l+1, r-1, string);
	}

}
