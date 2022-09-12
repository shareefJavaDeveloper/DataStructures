package ds.xor.bitmanipulations;

public class Find2NonRepeatingElementsIn2 {

	public static void main(String[] args) {
		
		
		int[] array = {1,3,5,2,6,5,1,3};
		
		
		int res = 0;
		
		for (int i = 0; i < array.length; i++) {
			res = res^array[i];
		}
		
		int result = res;
		
		/*
		 * It will work only if res values are not unique i.e one has to be odd another has to be even.
		 */
		for (int i = 0; i < array.length; i++) {
			if((array[i]&1)==0) {
				res = res^array[i];
			}
		}
		
		System.out.println(res);
		System.out.println(result^res);
		

	}

}
