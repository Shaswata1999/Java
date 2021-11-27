package ArrayList_Java;
import java.util.*;

public class SortElements {

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
		
		Collections.sort(arr);
		System.out.print(arr);
	}

}
