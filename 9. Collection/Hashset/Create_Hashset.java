package Hashset;

import java.util.*;
public class Create_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		
		hs.add("Sayan");
		hs.add("Soumik");
		hs.add("Shaswata");
		hs.add("Samrat");
		hs.add("Amit");
		hs.add("Sayan");	// No Duplicate value allow
		
		System.out.print(hs);	// INSERTION ORDER IS NOT PRESETVED
 	}

}
