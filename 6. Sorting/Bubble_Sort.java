import java.util.*;
public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Total number of elements: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter your elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("The elements are: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ,");
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++ ) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("The sorted elements are: ");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
	}
}