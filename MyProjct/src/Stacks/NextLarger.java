package Stacks;

import java.util.Stack;



import Arrays.Solution;

public class NextLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,5,3,1};
		solution(arr,5);

	}
	
	public static void solution(int arr[],int n) {
		Stack<Integer> s1=new Stack<>();
		int ans[]= new int[n];

		int j=n-1;
		for(int i=n-1;i>=0;i--) {
		if(s1.isEmpty())
			ans[j--]=-1;
		else if(s1.peek()>arr[i])
			ans[j--]=s1.peek();
		else if(s1.peek()<=arr[i]) {
			while(!s1.isEmpty() && s1.peek()<=arr[i])
				s1.pop();
			if(s1.isEmpty())
				ans[j--]=-1;
			else
				ans[j--]=s1.peek();
		}
		s1.push(arr[i]);
		}
		
		for(int i:ans)
		System.out.print(i+" ");
		
	}

}

