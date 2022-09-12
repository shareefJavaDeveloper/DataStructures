package ds.basic.bitmanipulations;

public class NumberOf1Bits {

	public static void main(String[] args) {
		
		int a = 5;
		int res = 0;
		while(a!=0) {
			System.out.println(Integer.toBinaryString(a));
			System.out.println(Integer.toBinaryString(a-1));
			a = a&(a-1);
			System.out.println("--------");
			System.out.println(a);
			res++;
		}
		
		System.out.println(res);

	}

}
