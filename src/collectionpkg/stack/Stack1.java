package collectionpkg.stack;

import java.util.*;

public class Stack1 {

	public static void main(String[] args) {
		// creating an instance of Stack class
		Stack<Integer> stk = new Stack<>();
		// checking stack is empty or not
		boolean result = stk.empty();
		System.out.println("Is the stack empty? " + result);
		// pushing elements into stack
		stk.push(78); // bottom
		stk.push(113);
		stk.push(90);
		stk.push(120); //top
		// prints elements of the stack
		System.out.println("Elements in Stack: " + stk);
		result = stk.empty();
		int top = stk.peek();
		System.out.println("Top of the stack "+ top);
		
		stk.pop();
		top = stk.peek();
		System.out.println("Top of the stack "+ top);
		System.out.println("Elements in Stack: " + stk);
		System.out.println("Is the stack empty? " + result);
	}

}
