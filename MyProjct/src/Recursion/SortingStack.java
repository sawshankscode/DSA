package Recursion;
import java.util.*;
public class SortingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack =new Stack<>();
		stack.add(2);
		stack.add(5);
		stack.add(6);
		stack.add(1);
		stack.add(11);
		stack.add(8);
		sort(stack);
		System.out.println(stack);

	}

	private static void sort(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		if(stack.size()==1)
			return;
		int temp=stack.pop();
		sort(stack);
		insert(stack,temp);
		return;
	}

	private static void insert(Stack<Integer> stack, int temp) {
		// TODO Auto-generated method stub
		if(stack.size()==0 || stack.peek()<=temp) {
			stack.push(temp);
			return;
		}
		int val=stack.pop();
		insert(stack,temp);
		stack.push(val);
		return;
	}

}
