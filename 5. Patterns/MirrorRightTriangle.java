/* 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */
public class MirrorRightTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st pattern
		int row = 6;
		for(int i=row; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		// 2nd pattern
		System.out.println("=======================");
		for(int i=1; i<=row; i++) {
			for(int j=row; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}
}