package LinkedList;

import java.util.*;
public class Add_First_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList lt = new LinkedList();
		
		lt.add("Shaswata");
		lt.add("Sayan");
		lt.add("Samrat");
		lt.add("Soumik");
		
		System.out.println(lt);
		
		lt.addFirst("Amit");
		System.out.println(lt);
		
		lt.addLast("Asish");
		System.out.print(lt);
	}

}
