import java.util.Deque;
import java.util.LinkedList;

public class SlideWindowMax {

	public static void main(String[] args) {
		Solution sol=new Solution();
		int a[]= {4,3,1,2,5,3,4,7,1,9};
		
		int ans[]=sol.slideWindowMax(a, 4);
		for(int x:ans)
		{
			System.out.print(x+" ");
		}
		
	}
	static class Solution{
		public int[] slideWindowMax(int a[],int k) {
			int n=a.length;
			int ans[]=new int[n-k+1];
			if(n==0 || n==1)
				return a;
			Deque<Integer> dq=new LinkedList<>();
			int i=0;
			for(;i<k;i++) {
				while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
					dq.removeLast();
				dq.addLast(i);
			}
			for(;i<n;i++) {
				ans[i-k]=a[dq.peekFirst()];
				while(!dq.isEmpty() && dq.peekFirst()<=i-k)
					dq.removeFirst();
				while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
					dq.removeLast();
				dq.addLast(i);
				
			}
			ans[i-k]=a[dq.peekFirst()]; 
			return ans;
			
		}
	}

}
