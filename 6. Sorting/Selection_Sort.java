import java.util.*;
public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Total Number of Elements: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter Elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print("Array is: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ,");
		}
		System.out.println();
		
		Selection_Sort ob = new Selection_Sort();
		ob.sort(arr);
		
		System.out.print("Sorting Elements ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ,");
		}
	}
	
	void sort(int arr[])
    {
        //int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < (arr.length)-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

}
