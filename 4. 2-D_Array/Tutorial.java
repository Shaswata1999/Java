
public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][2];		// initialize
		a[0][0] = 10;				
		a[0][1] = 20;					// Declaration
		a[1][0] = 30;
		a[1][1] = 40;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[1].length; j++) {
				System.out.print(a[i][j]+" ");		// print
			}
			System.out.println();
		}
	}
}
