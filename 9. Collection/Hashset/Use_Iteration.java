package Hashset;

import java.util.*;
public class Use_Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		
		hs.add("Sayan");
		hs.add("Soumik");
		hs.add("Shaswata");
		hs.add("Samrat");
		hs.add("Amit");
		hs.add("Sayan");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
