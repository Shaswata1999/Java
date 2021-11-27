import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.print("Factorial of "+num+" is "+fact);
	}
}
