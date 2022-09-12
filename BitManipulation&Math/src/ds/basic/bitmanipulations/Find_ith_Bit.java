package ds.basic.bitmanipulations;

import java.util.Scanner;

public class Find_ith_Bit {

	public static void main(String[] args) {
		
		/*
		 * 		a	|	b	|	a&b		a|b		a^b		~a
		 *      ------------------------------------------	
		 * 		0	|	0	|	 0		 0		 0		 1
		 * 		0	|	1	|	 0		 1		 1		 1
		 * 		1	|	0	|	 0		 1		 1		 0
		 * 		1	|	1	|	 1		 1		 0		 0
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		int i = scan.nextInt();
		/*
		 * Here lets move the bits till the i'th position given
		 */
		int mask = 1<<i;
		/*
		 * If the bitwise & of number and mask is 0 then the position of the bit is also 0
		 * Otherwise it was an non negative number i.e.., 1
		 */
		if((number&mask)==0) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}

	}

}
