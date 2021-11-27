import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		
		int t1 = num;
		int count=0;
		while(t1!=0) {
			count = count+1;
			t1 = t1/10;
		}
		
		int t2 = num;
		int arm=0;
		while(t2!=0) {
			int rem = t2%10;
			int mul=1;
			for(int i=1; i<=count;i++) {
				mul = mul*rem;
			}
			arm = arm+mul;
			t2 = t2/10;
		}
		if(arm == num)
			System.out.print(num+" is amstrong number");
		else
			System.out.print(num+" is not amstrong number");
	}
}