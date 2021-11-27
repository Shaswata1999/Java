import java.util.*;
public class CountOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print("Array elements are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int coun_even = 0, sum_even=0;
		int count_odd = 0, sum_odd=0;
		
		
		for(int i=0;i<size;i++) {
			if(arr[i]%2 == 0) {
				coun_even = coun_even+1;
				sum_even = sum_even+arr[i];
			}
			else {
				count_odd = count_odd+1;
				sum_odd = sum_odd+arr[i];
			}
		}
		System.out.println("Total even number in the array is: "+coun_even);
		System.out.println("Sum of the even numbers in the array is: "+sum_even);
		System.out.println("Total odd number in the array is: "+count_odd);
		System.out.println("Sum of the odd numbers in the array is: "+sum_odd);
		
	}

}
