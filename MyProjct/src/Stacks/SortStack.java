package Stacks;

public class SortStack {
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> s1=new Stack<>();
		if(s.isEmpty() || s==null)
		    return s;
		Integer top=null;
		while(!s.isEmpty()){
		    top=s.pop();
		    while(!s1.isEmpty() && top<s1.peek())
		        s.push(s1.pop());
		    s1.push(top);
		}
		return s1;
	}
}
