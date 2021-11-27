import java.util.*;
public class MargeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		// Initialize the size of the both array
		System.out.print("Enter the size of the first array: ");
		int size1 = scan.nextInt();
		
		System.out.print("Enter the size of the second array: ");
		int size2 = scan.nextInt();
		
		// create array
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		
		// Insert elements in the array
		System.out.print("Enter elements in the first array: ");
		for(int i=0;i<size1;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println();
		
		System.out.print("Enter elements in the second array: ");
		for(int i=0;i<size2;i++) {
			arr2[i] = scan.nextInt();
		}
		System.out.println();
		
		// Display array elements
		System.out.print("Elements in the first array is: ");
		for(int i=0;i<size1;i++)
			System.out.print(arr1[i]+" ");
		System.out.println();
		
		System.out.print("Elements in the second array is: ");
		for(int i=0;i<size2;i++)
			System.out.print(arr2[i]+" ");
		System.out.println();
		
		// Create Third Array
		int big_size = size1+size2;
		
		int[] arr_big = new int[big_size];
		
		// Marge two array
		for(int i=0;i<size1;i++) {
			arr_big[i] = arr1[i];
		}
		for(int i=0;i<size2;i++) {
			arr_big[size1+i] = arr2[i];
		}
		
		//Display marge array
		System.out.print("Elements in the marge array is: ");
		for(int i=0;i<big_size;i++)
			System.out.print(arr_big[i]+" ");
	}
}