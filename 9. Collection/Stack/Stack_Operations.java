package Stack;

import java.util.Stack;

public class Stack_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack();
		
		st.add("Shaswata");
		st.add("Sayan");
		st.add("Soumik");
		st.add("Samrat");
		
		System.out.println(st);
		
		st.push("Amit");
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		
		System.out.println(st.peek());	 //Peek
	}

}
