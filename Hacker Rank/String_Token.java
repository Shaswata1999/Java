/*
 * Given a S string, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or
 * more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
 * 
 * Note: You may find the String.split method helpful in completing this challenge.
 * 
 * Input Format

	A single string, S .
	
	Constraints

		S is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question
		marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
		
	Output Format
	On the first line, print an integer, n , denoting the number of tokens in string s (they do not need to be unique). Next, 
	print each of the n tokens on a new line in the same order as they appear in input string s.
	
	Sample Input
	
	He is a very very good boy, isn't he?
	
	Sample Output
	
		10
		He
		is
		a
		very
		very
		good
		boy
		isn
		t
		he
		
	Explanation
	
	We consider a token to be a contiguous segment of alphabetic characters. There are a total of 10 such tokens in string s,
	and each token is printed in the same order in which it appears in string s.

 * */

import java.io.*;
import java.util.*;

public class String_Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	     String s = scan.nextLine();
	    // Write your code here.
	    scan.close();
	    s = s.trim();
	    if (s.length() == 0) {
	    	System.out.println(0);
	   } 
	   else 
	   {
		   String[] strings = s.split("['!?,._@ ]+");
	       System.out.println(strings.length);
	       for (String str : strings)
	       System.out.println(str);
	   }
	}
}