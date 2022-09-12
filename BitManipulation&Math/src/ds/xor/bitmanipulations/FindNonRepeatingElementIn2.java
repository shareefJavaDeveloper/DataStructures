package ds.xor.bitmanipulations;

import java.util.Scanner;

public class FindNonRepeatingElementIn2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number of Elements in an array");
		int n = scan.nextInt();
		if((n&1)==0) {
			System.out.println(n + " is not a valid input!");
			System.exit(0);
		}else {
			System.out.println(n + " is a valid input!");
		}
		int[] array = new int[n];
		System.out.println("-------------");
		for	(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("-------------");
		
		int result = 0;
		
		for (int i = 0; i < array.length; i++) {
			result = result ^ array[i];
		}
		
		System.out.println("Non repeating element is : " + result);

	}

}
