package ds.Recursion;

public class MatrixPaths {

	public static void main(String[] args) {
		
		int columns = 2;
		int rows = 4;
		
		int count =  pathCount(rows, columns);
		
		System.out.println(count);

	}

	private static int pathCount(int rows, int columns) {
		
		if(rows == 1 || columns == 1) {
			return 1;
		}
		
		return pathCount(rows-1, columns) + pathCount(rows, columns-1);
		
	}

}
