package Vector;

import java.util.*;
public class Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector arr = new Vector();
		arr.add("Shaswata");
		arr.add("Sayan");
		arr.add("Soumik");
		arr.add("Samrat");
		arr.add("Amit");
		arr.add("Asish");
		System.out.println(arr);
		
		arr.remove("Asish");
		System.out.println(arr);
		
		arr.remove(4);
		System.out.println(arr);
	}

}
