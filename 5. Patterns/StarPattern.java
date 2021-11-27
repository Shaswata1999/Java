/*
  *
  * *
  * * *
  * * * *
  ==========
  * * * * *
  * * * *
  * * *
  * *
  * 
  ==========
  *
  * * 
  * * *
  * * * *
  * * *
  * *
  * 
  ==========
	     *
	   * *
	 * * *
  ==========
  * * * *
  	* * *
  	  * *
  	  	*
  ===========
 		 *
	   * *
	 * * *
	   * *
	   	 *
   ==========
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 ==============
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
  ==============
  *
  	*
  	  *
  	    *
  	      *
  ===============
	    *
	   * 
	  *  
	 *   
	* 
 */
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=5;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		for(int i=1; i<=row; i++) {
			for(int j=row; j>=i; j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("===============");
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=row; i++) {
			for(int j=row-1; j>=i; j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("===============");
		for(int i=1; i<=row; i++) {
			for(int j=row-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		for(int i=1; i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=row; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		for(int i=1; i<=row; i++) {
			for(int j=row-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=row-1; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		for(int i=1;i<=row;i++) {
			for(int j=row-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===============");
		for(int i=1; i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=row; k>=i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===============");
		for(int i=1;i<=row;i++) {
			for(int j=1; j<=i;j++) {
				if(i>=2 && j<=i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		for(int i=1;i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i>=2 && k>1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}