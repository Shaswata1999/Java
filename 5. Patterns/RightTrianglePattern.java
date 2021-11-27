// Right Triangle Pattern
/*1
  1 2
  1 2 3
  1 2 3 4
  
  ========= 
  
  1 
  2 2
  3 3 3
  4 4 4 4
  
  ==========
  
  1
  2 3
  4 5 6
  7 8 9 10
  
  =========
  1
  2 1
  3 2 1
  4 3 2 1
  
  ========
  1
  1 2 1
  1 2 3 2 1
  1 2 3 4 3 2 1
  
  =========
  1
  2 6
  3 7 10
  4 8 11 13
  5 9 12 14 15
 */

public class RightTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=5;
		for(int i=1; i<row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		// 2nd pattern
		for(int i=1; i<row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("=======================");
		// 3rd pattern
		int count = 0;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<i; j++) {
				count = count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		System.out.println("=======================");
		// 4th pattern
		for(int i=1; i<=row; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("=======================");
		// 5th pattern
		for(int i=1; i<row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1; k>=1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("=======================");
		// 6th pattern
		for(int i=1; i<=row; i++) {
			int no = i;
			for(int j=1; j<=i; j++) {
				System.out.print(no+" ");
				no = no+row-j;
			}
			System.out.println();
		}
	}
}