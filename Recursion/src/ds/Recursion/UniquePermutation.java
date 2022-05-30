package ds.Recursion;

import java.util.HashSet;

public class UniquePermutation {

	public static void main(String[] args) {
		
		String word = "abb";
		int start = 0;
		int end = word.length()-1;
		HashSet<String> hash = new HashSet<>();
		uniquePermutation(word,start,end,hash);
		for (String string : hash) {
			System.out.println(string);
		}

	}

	private static void uniquePermutation(String word, int start, int end, HashSet<String> hash) {
		
		if(start==end) {
			if(!hash.contains(word)) {
				hash.add(word);
			}
		}
		else {
			for (int i = start; i <= end; i++) {
				word = swap(word,start,i);
				uniquePermutation(word, start+1, end, hash);
				word = swap(word,start,i);
		}
		
	}
	}
		private static String swap(String str, int i, int j) 
	    { 
	        char temp; 
	        char[] array = str.toCharArray(); 
	        temp = array[i] ; 
	        array[i] = array[j]; 
	        array[j] = temp; 
	        return String.valueOf(array); 
	    }

}
