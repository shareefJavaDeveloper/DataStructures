package ds.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	
	//Nothing but subsequences
	
	public static void main(String[] args) {
		
		String s = "abc";
		int start = 0;
		List<String> list = new ArrayList<String>();
		powerSet(s,start,list);
		
		
	}

	private static void powerSet(String s, int start, List<String> list) {
		
		if(start>=s.length()) {
			System.out.println(list);
			return;
		}
		Character ch = s.charAt(start);
		list.add(ch.toString());
		
		powerSet(s, start+1, list);
		
		list.remove(ch.toString());
		
		powerSet(s, start+1, list);
		
	}

}
