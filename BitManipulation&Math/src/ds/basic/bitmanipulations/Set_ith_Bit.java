package ds.basic.bitmanipulations;

public class Set_ith_Bit {
	
	public static void main(String[] args) {
		
		int number = 5;
		System.out.println("number ->    "+Integer.toBinaryString(number));
		int i = 1;
		
		int mask = 1<<i;
		System.out.println("mask ->       "+Integer.toBinaryString(mask));
		
		int settedBit = number|mask;
		
		System.out.println("settedBit -> "+Integer.toBinaryString(settedBit));
		
	}

}
