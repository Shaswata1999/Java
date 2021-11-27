import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		System.out.print("Enter elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print("Elements are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");;
		}
		System.out.println();
		
		//second largest
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for(int i=0;i<size;i++) {
			if(arr[i]>largest) {
				second_largest = largest;
				largest = arr[i];
			}
			else if (arr[i]>second_largest && arr[i]!=largest) {
				second_largest = arr[i];
			}
		}
		System.out.print("Second Largest Number is: "+second_largest);
		System.out.println();
		
		//second smallest
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<size;i++) {
			if(arr[i]<smallest) {
				second_smallest = smallest;
				smallest = arr[i];
			}
			else if (arr[i]<second_smallest && arr[i]!=smallest) {
				second_smallest = arr[i];
			}
		}
		System.out.print("Second Smallest number is: "+second_smallest);
	}
}