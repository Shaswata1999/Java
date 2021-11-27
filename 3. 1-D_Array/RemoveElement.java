//Write a Java program to remove a specific element from an array.

import java.util.*;
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean remove = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int size = scan.nextInt();
		
		System.out.print("Enter elements: ");
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("The Array is: ");
		for(int i=0; i<size; i++) {
			System.out.print(+arr[i] +", ");
		}
		
		System.out.println();
		System.out.print("Enter the element to remove: ");
		int find = scan.nextInt();
		
		for(int i=0; i<size; i++) {
			if(arr[i] == find) {
				arr[i] = 0;
				remove = true;
				break;
			}		}
		if(remove) {
			System.out.println("Element deleted");
			System.out.print("The new elements are: ");
		}
		else {
			System.out.println("Element not found in array");
			System.out.print("The elements are: ");
		}
		
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] +", ");
		}
	}

}
