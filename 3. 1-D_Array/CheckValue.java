import java.util.*;
public class CheckValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean find = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total number of elements: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++)
			arr[i] = scan.nextInt();
		
		System.out.print("Enter the element to be find: ");
		int x = scan.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(x == arr[i]) {
				find = true;
				break;
			}
		}
		if(find)
			System.out.print(x+" is found");
		else
			System.out.print(x+" is not found");
	}
}