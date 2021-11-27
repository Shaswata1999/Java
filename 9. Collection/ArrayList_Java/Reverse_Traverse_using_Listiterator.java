package ArrayList_Java;

import java.util.*;
public class Reverse_Traverse_using_Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr = new ArrayList();
		arr.add("Shaswata");
		arr.add("Sayan");
		arr.add("Soumik");
		arr.add("Samrat");
		arr.add("Amit");
		arr.add("Asish");
		
		System.out.println(arr);
		
		ListIterator ltr = arr.listIterator();
		
		while(ltr.hasNext())
		{
			ltr.next();
		}
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}
}