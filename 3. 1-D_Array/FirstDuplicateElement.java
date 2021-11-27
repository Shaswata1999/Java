import java.util.*;
public class FirstDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println();
		
		int temp=0;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i] == arr[j]) {
					System.out.print("First common element is: "+arr[i]);
					temp = temp+1;
					break;
				}
			}
			if(temp>0)
				break;
		}
	}

}
