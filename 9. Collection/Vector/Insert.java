package Vector;

import java.util.*;
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector arr = new Vector();
		arr.add("Shaswata");
		arr.add("Sayan");
		arr.add("Soumik");
		System.out.println(arr);
		
		arr.add(2,"Samrat");	// add in a position. Here want to add samrat in the the 2no position
		System.out.print(arr);
	}

}
