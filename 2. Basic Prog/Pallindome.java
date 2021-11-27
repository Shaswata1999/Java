import java.util.*;
public class Pallindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		int len = str.length();
		String rev="";
		
		for(int i=len-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
			System.out.print("The String is pallindome");
		else
			System.out.print("The String is not pallindome");
	}

}
