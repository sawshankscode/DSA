package Recursion;

import java.util.*;

public class DeleteMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack =new Stack<>();
		stack.add(2);
		stack.add(5);
		stack.add(6);
		stack.add(1);
		stack.add(11);
		stack.add(8);
		
		
		System.out.println(solve(stack,stack.size()));
	}

	private static Stack<Integer> solve(Stack<Integer> stack, int size) {
		// TODO Auto-generated method stub
		if(stack.size()==0)
			return stack;
		int k=(size/2)+1;
		delete(stack,k);
		return stack;
	}

	private static void delete(Stack<Integer> stack,int k) {
		// TODO Auto-generated method stub
		if(k==1) {
			stack.pop();
			return;
		}
		int temp=stack.pop();
		delete(stack,k-1);
		stack.push(temp);
		return;
	}

}
