package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MaximumOfMinimumForEveryWindowSize {
	public static void main(String[] args) {
		
	
		int arr[] = {10, 20, 30, 50, 10, 70, 30};
		int n=arr.length;
		int ans[]=new int[n+1];
		Stack<Integer> s=new Stack<>();
		int left[]=new int[n+1];
		int right[]=new int[n+1];
		for (int i=0; i<n; i++) {
            left[i] = -1;
            right[i] = n;
        }
		for(int i=0;i<n;i++) {
			
			while(!s.isEmpty() && arr[s.peek()]>=arr[i])
				s.pop();
			if(!s.isEmpty())
				left[i]=s.peek();
			
			s.push(i);
		}
		while(!s.isEmpty())
			s.pop();
		
		for(int i=n-1;i>=0;i--) {
			
			while(!s.isEmpty() && arr[s.peek()]>=arr[i])
				s.pop();
			if(!s.isEmpty())
				right[i]=s.peek();
			
			s.push(i);

		}
		 for (int i=0; i<=n; i++)
	            ans[i] = 0;
	     
		for(int i=0;i<n;i++) {
			
			int len=right[i]-left[i]-1;
			
			ans[len]=Math.max(ans[len],arr[i]);
			
		}
		 for (int i=n-1; i>=1; i--)
	            ans[i] = Math.max(ans[i], ans[i+1]);
		 
		for(int i=1;i<=n;i++)
			System.out.print(ans[i]+" ");
		
	}
        // Your code here
       
}
