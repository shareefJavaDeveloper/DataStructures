package ds.basic.bitmanipulations;

public class Clear_ith_Bit {
	
	public static void main(String[] args) {
		
		int number = 9;
		
		int i = 1;
		
		//left shift 1 by i positions and invert it
		int mask = ~(1<<i);
		
		//appply bitwise & on number and mask to clear the ith bit of number
		int result = number&(mask);
		
		System.out.println(result);
		
	}

}
