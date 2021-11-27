package ArrayList_Java;

import java.util.*;
public class Replace_Using_ListIterator {

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
			if(ltr.next().equals("Amit"))
			{
				ltr.set("Amrita");
			}
		}
		System.out.println(arr);
	}

}
