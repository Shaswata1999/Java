/*Sample Input
5
10
20
30
40
50

Sample Output
10
20
30
40
50*/

import java.util.Scanner;
public class Problem1_Hackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of element");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++)
			a[i] = sc.nextInt();
		sc.close();					//use for remove 1st element of an array
		
		System.out.println("output is: ");
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}

}
