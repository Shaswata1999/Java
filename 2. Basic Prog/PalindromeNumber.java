import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number to check palindrome: ");
		int num = scan.nextInt();
		
		int rev=0;
		
		int rem = rev%2;
		rev = rev*10+rem;
		num = num/10;
		
		if(num == rev)
			System.out.print("The number is a palindrome number");
		else
			System.out.print("The number is a palindrome number");
	}

}
