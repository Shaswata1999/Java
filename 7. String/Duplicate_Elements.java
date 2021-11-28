import java.util.*;
public class Duplicate_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String str = sc.nextLine();
		
		char strarr[] = str.toCharArray();
		
		int count = 0;
		
		System.out.println("Duplicate elements are: ");
		for(int i=0;i<strarr.length;i++)
		{
			count = 1;
			for(int j=i+1;j<strarr.length;j++)
			{
				if(strarr[i] == strarr[j] && strarr[i]!=' ') {
					count++;
					strarr[j] = '0';
				}
			}
			if(count>1 && strarr[i] != '0')
				System.out.println(strarr[i]);
		}
	}

}
