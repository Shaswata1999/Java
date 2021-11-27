//Write a Java program to insert an element (specific position) into an array.

import java.util.*;
public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean insert = false;
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
		System.out.print("Enter the new value: ");
		int val = scan.nextInt();
		
		System.out.println();
		System.out.print("Enter the position where you want to insert: ");
		int pos = scan.nextInt();
		
		for(int i=0; i<=pos; i++) {
			if(pos > size) {
				insert = true;
				break;
			}
			else {
				arr[pos] = val;
			}
		}
		if(insert)
			System.out.println("Invalid position number");
		else
			System.out.println("Value inserted");
		
		System.out.print("The elements are: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(+arr[i]+", ");
		}
	}

}
