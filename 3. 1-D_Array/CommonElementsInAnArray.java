import java.util.*;
public class CommonElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println();
		
		System.out.print("Elements are: ");
		for(int i=0; i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("Common Elements are: ");
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}