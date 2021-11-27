import java.util.*;
public class Maximum_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String st = sc.nextLine();
		
		int[] arr = new int[127];
		
		for(int i=0; i<st.length(); i++)
		{
			arr[st.charAt(i)] = arr[st.charAt(i)]+1;
		}
		
		int max = -1;
		char c=' ';
		
		for(int i=0; i<st.length(); i++)
		{
			if(max < arr[st.charAt(i)])
			{
				max = arr[st.charAt(i)];
				c = st.charAt(i);
			}
		}
		System.out.println("Maximum repeated character is: "+c);
	}

}
