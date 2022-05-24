package ds.Recursion;

public class SumOfN {

	public static void main(String[] args) {
		
		
		int number = 5;
		
		if(number>=1) {
			System.out.println(sumOfN(number));
		}
		else
			System.out.println("Error");
		

	}

	private static int sumOfN(int number) {
		
		if (number == 1) {
			
			return 1;
			
		}
			int partial_ans = sumOfN(number-1);
			return number + partial_ans;
		
	}

}
