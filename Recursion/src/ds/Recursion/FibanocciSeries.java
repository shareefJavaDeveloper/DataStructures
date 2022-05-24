package ds.Recursion;

public class FibanocciSeries {
	
	/**
	 * Finding the Nth term of fibanocci series using recursion
	 * --------------------------------------------------------
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int number = 6;
		
		if(number>0) {
			System.out.println(fibanocci(number));
		}
		else
			System.out.println("Error");
		
	}

	private static int fibanocci(int number) {
		if (number==1) return 1;
		if (number==2) return 1;
		int partial_Ans1 = fibanocci(number-1);
		int partial_Ans2 = fibanocci(number-2);
		return partial_Ans1+partial_Ans2;
	}

}
