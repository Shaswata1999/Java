import java.util.*;
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String Value: ");
		String s = sc.nextLine();
		
		String rev = "";
		for(int i=s.length()-1; i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse String is: "+rev);
	}

}
