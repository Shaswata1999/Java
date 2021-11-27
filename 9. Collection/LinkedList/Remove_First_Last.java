package LinkedList;

import java.util.*;
public class Remove_First_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList lt = new LinkedList();
		
		lt.add("Shaswata");
		lt.add("Sayan");
		lt.add("Samrat");
		lt.add("Soumik");
		
		System.out.println(lt);
		
		lt.removeFirst();
		System.out.println(lt);
		
		lt.removeLast();
		System.out.println(lt);
	}

}
