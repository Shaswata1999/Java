import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		for(int i=1; i<11; i++) {
			int res = num*i;
			System.out.println(num+" * "+i+" = "+res);
		}
	}

}
