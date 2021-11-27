import java.util.*;
public class MaxMIn {

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
		
		int max = arr[0];
		for(int i=1; i<size; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.print("Largest number is: "+max);
		System.out.println();
		
		int min = arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.print("Smallest number is: "+min);
	}

}
