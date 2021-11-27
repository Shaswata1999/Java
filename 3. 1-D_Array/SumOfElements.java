import java.util.*;
public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total number of elements: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum = sum+arr[i];
		}
		System.out.println("Sum of the elements is: "+sum);
	}

}
