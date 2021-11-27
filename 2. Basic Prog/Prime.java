import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pn = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		for(int i=2; i<num-1; i++) {
			if(num%i == 0)
				pn = pn+1;
		}
		if(pn > 0)
			System.out.print(num+" is not prime number.");
		else
			System.out.print(num+" is prime number.");
	}

}
