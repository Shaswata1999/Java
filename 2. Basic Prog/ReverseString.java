import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.next();
		
		int len = str.length();
		String rev = "";
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.print("Reverse String is: "+rev);
	}

}
