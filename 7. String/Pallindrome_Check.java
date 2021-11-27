import java.util.*;
public class Pallindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		String s1 = s;
		
		String rev = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev = rev+s1.charAt(i);
		}
		if(s.equals(rev))
			System.out.println(s+" : This string is Pallindrome");
		else
			System.out.println(s+" : This string is not Pallindrome");
	}

}
