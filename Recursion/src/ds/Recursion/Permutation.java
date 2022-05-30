package ds.Recursion;

import java.util.ArrayList;

public class Permutation {
	
	public static void main(String[] args) {
		String s = "abc";
		int start = 0;
		int end = s.length()-1;
		
		permutation(s,start,end);
	}

	private static void permutation(String s, int start, int end) {
		
		if (start == end) {
			System.out.println(s);
		}else {
		
		for (int i = start; i <= end; i++) {
			s = swap(s,start,i);
			permutation(s, start+1, end);
			s = swap(s,start,i);
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
