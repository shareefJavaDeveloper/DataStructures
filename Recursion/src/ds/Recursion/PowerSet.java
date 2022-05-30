package ds.Recursion;




public class PowerSet {
	
	
	
	public static void main(String[] args) {
		
		String s = "abc";
		int start = 0;
		String curr = "";
		powerSet(s,start,curr);
		
		
	}

	private static void powerSet(String s, int start, String curr) {
		
		if(start == s.length()) {
			System.out.println("( "+ curr+" ) ");
			return;
		}
		
		powerSet(s, start+1, curr+s.charAt(start));
		powerSet(s, start+1, curr);
		
	}

}
