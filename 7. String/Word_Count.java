import java.util.*;
public class Word_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String str = sc.nextLine();
		
		int Total_Word = 1;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
				Total_Word++;
		}
		System.out.println("Total words in the sentence are: "+Total_Word);
	}

}
