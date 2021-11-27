import java.util.*;
public class FibonakiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("End Number of the series: ");
		int num = scan.nextInt();
		
		int a=0, b=1,c;
		for(int i=1; i<=num; i++) {
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}

}
