package ds.basic.math;

public class Power {

	public static void main(String[] args) {
		
		int number = 521;
		int power = 765;
		
		System.out.println(power(number,power));

	}

	private static int power(int number, int power) {
		
		
		if(power==0) return 1;
		
		return number * power(number, power-1);

}
}
