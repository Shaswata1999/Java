// Write a Java program to find the number of common elements between two arrays of integers.

import java.util.*;
public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of 1st array: ");
		int size1 = scan.nextInt();
		System.out.print("Enter the size of 2nd array: ");
		int size2 = scan.nextInt();
		
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		
		System.out.print("Enter elements in 1st array: ");
		for(int i=0; i<size1; i++)
			arr1[i] = scan.nextInt();
		
		System.out.print("Enter elements in 2nd array: ");
		for(int i=0; i<size2; i++)
			arr2[i] = scan.nextInt();
		
		System.out.print("Common elements are: ");
		for(int i=0; i<size1; i++) {
			for(int j=0; j<size2; j++) {
				if(arr1[i] == arr2[j]) {
					count++;
					System.out.print(arr1[i]+" ");
				}
			}
		}
		System.out.println();
		System.out.print("Total Number of common elements in both array is "+count);
	}
}