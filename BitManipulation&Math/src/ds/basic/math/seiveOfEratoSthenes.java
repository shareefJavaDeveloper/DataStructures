package ds.basic.math;

import java.util.Arrays;
import java.util.Scanner;

public class seiveOfEratoSthenes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter integer of highest range: ");
		System.out.println();
		int number = scan.nextInt();
		
		boolean[] array = seiveOfEratoSthenes(number);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=false) {
				System.out.println(i);
			}
		}
		

	}
	
	public static boolean[] seiveOfEratoSthenes(int number) {
		
		boolean isPrime[] = new boolean[number];
		
		Arrays.fill(isPrime, true);

		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i = 2; i*i<=number; i++) {
			
			for(int j=2*i; j<number; j += i) {
				
				isPrime[j] = false;
				
			}
		}
		
		return isPrime;
	}

}
