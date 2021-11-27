import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter Sysmbol --> (+,-,*,/)");
		String sym = sc.next();
		
		switch (sym) {
		case "+": res = num1+num2;
			System.out.print(res);
			break;
		
		case "-": res = num1-num2;
			System.out.print(res);
			break;
		
		case "*": res = num1*num2;
			System.out.print(res);
			break;
		
		case "/": res = num1/num2;
			System.out.print(res);
			break;
		
		default:
			System.out.print("Invalid Input Symbol");
			break;
		}
	}

}
