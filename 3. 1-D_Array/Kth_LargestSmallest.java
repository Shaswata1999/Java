import java.util.*;
public class Kth_LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int Size = scan.nextInt();
		
		int[] arr = new int[Size];
		
		System.out.print("Enter the elements: ");
		for(int i=0; i<Size; i++)
			arr[i] = scan.nextInt();
		System.out.println();
		
		System.out.print("Position of highest number you want: ");
		int kth = scan.nextInt();
		System.out.print("Position of smallest number you want: ");
		int sml = scan.nextInt();
		
		if(kth > Size) {
			System.out.println("Wrong position");
		}
		
		System.out.print("Elements are: ");
		for(int i=0;i<Size;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		for(int i=0;i<Size-1;i++) {
			for(int j=i+1;j<Size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i == kth-1) {
				System.out.println(kth+"rd largest number is: "+arr[i]);
				break;
			}
		}
		for(int i=0;i<Size-1;i++) {
			for(int j=i+1;j<Size;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i == sml-1) {
				System.out.print(sml+"rd smallest number is: "+arr[i]);
				break;
			}
		}
	}
}