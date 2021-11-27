//Write a Java program to reverse an array of integer values.

import java.util.*;
public class ReverseTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int size = scan.nextInt();
		
		System.out.println("Enter elements: ");
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("The Original Array is: ");
		for(int i=0; i<size; i++) {
			System.out.print(+arr[i] +", ");
		}
		System.out.println();
		System.out.print("The Reverse Array is: ");
		for(int i=(size-1); i>=0; i--) {
			System.out.print(+arr[i] +", ");
		}
	}

}
