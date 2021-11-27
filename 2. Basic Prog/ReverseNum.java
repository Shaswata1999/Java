import java.util.*;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		int rev = 0;
		
		while(num != 0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.print("Reverse number is"+rev);
	}
}