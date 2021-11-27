package ArrayList_Java;
import java.util.*;

public class Create_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr = new ArrayList();
		arr.add("Shaswata");
		arr.add("Sayan");
		arr.add("Samrat");
		arr.add("Soumik");
		arr.add("Amit");
		arr.add("Asish");
		arr.add("Shaswata"); 	// Duplicate element accept
		arr.add(5);				// Integer input as a string
		Integer n = new Integer(15);	// Integer class is called wrapper.
		arr.add(n);
		arr.add(new Double(15.5));		// Anonymous Object
		
		System.out.print(arr);
	}

}
