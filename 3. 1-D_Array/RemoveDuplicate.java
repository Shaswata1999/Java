import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print("Elements are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int flag=0;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i] == arr[j]) {
					arr[i] = 0;
					flag = flag+1;
				}
			}
		}
		if(flag>0) {
			System.out.print("After removing the duplicate elements the new array is: ");
			for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		}
		else
			System.out.print("No duplicate element found....");	
	}
}