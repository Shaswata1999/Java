package Hashset;

import java.util.*;
public class Create_LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Sayan");
		lhs.add("Soumik");
		lhs.add("Samrat");
		lhs.add("Shaswata");
		lhs.add("Soumik");
		
		Iterator it = lhs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
