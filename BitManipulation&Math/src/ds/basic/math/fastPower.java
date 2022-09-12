package ds.basic.math;

public class fastPower {

	public static void main(String[] args) {
		
		System.out.println(fastPowerfn(2,6));

	}

	private static int fastPowerfn(int a, int b) {
		int res = 1;
		
		while(b>0) {
			//replacing b%2 to determine even/odd with bit operator
			if((b&1) != 0) {
				res = res*a;
			}
			a = a*a;
			//using right shift by 1 to compute b/2
			b = b >> 1;
			
		}
		
		return res;
	}

}
