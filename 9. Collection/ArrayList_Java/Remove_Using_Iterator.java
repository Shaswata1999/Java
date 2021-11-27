package ArrayList_Java;
import java.util.*;

public class Remove_Using_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr = new ArrayList();
		arr.add("Shaswata");
		arr.add("Sayan");
		arr.add("Soumik");
		arr.add("Samrat");
		arr.add("Amit");
		arr.add("Asish");
		arr.add("Amit");
		
		System.out.println(arr);
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals("Amit")){		// Remove all duplicate elements
				itr.remove();
			}
		}
		System.out.println(arr);
	}

}
