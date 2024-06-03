package arrays;

// In a two dimensional array dta is stored in row and column based index.

public class Two_Dimensional {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][2];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			for(int j=0 ; j<arr[0].length ; j++) {
				System.out.println("arr["+i+"]["+j+"] -> "+ arr[i][j]);
			}
		}
	}
}
// arr --> [0] --> [0] [1]
//     --> [1] --> [0] [1]