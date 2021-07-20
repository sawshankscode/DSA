package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker {
	
	
	
	public static void main(String[] args) {
		
		String input= new Scanner(System.in).nextLine();
		
		System.out.println(checkParanthesis(input));
		
		
	}

	private static int  checkParanthesis(String input) {
		
		Stack<Character> stack = new Stack<>();
		int n=input.length();
		
		
		for(char c:input.toCharArray()) {
			if(c=='{' || c=='[' || c=='(')
				stack.push(c);
			else {
				if((c=='}' && stack.peek()!='{') || (c==']' && stack.peek()!='[') || (c==')' && stack.peek()!='(') )
					return input.indexOf(c)+1;
				else
					stack.pop();
			}
			
		}
		
	
	return 0;
	}

}
