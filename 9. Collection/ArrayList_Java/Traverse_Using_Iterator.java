package ArrayList_Java;

import java.util.*;
public class Traverse_Using_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr = new ArrayList();
		arr.add("Shaswata");
		arr.add("Sayan");
		arr.add("Soumik");
		arr.add("Samrat");
		arr.add("Amit");
		arr.add("Asish");
		
		Iterator itr = arr.iterator();  // Traverse elements one by one
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
