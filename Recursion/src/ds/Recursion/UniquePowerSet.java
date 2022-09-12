package ds.Recursion;

import java.util.HashSet;

public class UniquePowerSet {

	public static void main(String[] args) {
		String s = "abb";
		int start = 0;
		String curr = "";
		HashSet<String> hash = new HashSet<String>();
		
		powerSet(s,start,curr,hash);
		for (String string : hash) {
			System.out.println(string);
		}
	}

	private static void powerSet(String s, int start, String curr, HashSet<String> hash) {
		
		if(start == s.length()) {
			if(!hash.contains(s)) hash.add(curr);
		}
		else {
			powerSet(s, start+1, curr+s.charAt(start), hash);
			powerSet(s, start+1, curr, hash);
		}
		
	}

}
