package Accenture;

import java.util.Stack;

public class SuperiorArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,8,9,7,4,2};
		System.out.println(solution(arr,6));

	}

	private static int solution(int[] arr, int n) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		int ans=0;
		for(int i=n-1;i>=0;i--) {
			if(s.isEmpty()) {
				s.add(arr[i]);
				ans++;
			}
			else if(s.peek()<arr[i]) {
				s.add(arr[i]);
				ans++;
			}
				
		}
		return ans;
	}

}
