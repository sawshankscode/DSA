package Recursion;

import java.util.*;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack =new Stack<>();
		stack.push(2);
		stack.push(5);
		stack.push(6);
		stack.push(1);
		stack.push(11);
		stack.push(8);
		reverse(stack);
		System.out.println(stack);

	}

	private static void reverse(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		if(stack.size()==1) {
			return;
		}
		int temp=stack.pop();
		reverse(stack);
		insert(stack,temp);
		return;
		
	}

	private static void insert(Stack<Integer> stack, int temp) {
		// TODO Auto-generated method stub
		if(stack.size()==0) {
			stack.push(temp);
			return;
		}
		int ele=stack.pop();
		insert(stack,temp);
		stack.push(ele);
		return;
		
	}

}
