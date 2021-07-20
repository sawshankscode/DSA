package Algoritms;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlideWindowMax {
	static int count=0;
	public static void main(String[] args) {
		int a=1;
		int b=0;
		
		System.out.println(stairs(4));
		
	}
	public static int stairs(int n) {
//		return stairsUtilRecursive(n+1);
		return stairsUtilDP(n+1,2);
//		return stairsUtilSlidingWindow(n+1);
	}
	public static int stairsUtilSlidingWindow(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static int stairsUtilDP(int n,int m) {
		int res[]=new int[n];
		res[0]=1;
		res[1]=1;
		for(int i=2;i<n;i++) {
			res[i]=0;
			for(int j=1;j<=m && j<=n;j++)
				res[i]+=res[i-j];
		}
		return res[n-1];
	}
	public static int stairsUtilRecursive(int n) {
		if(n<=1)
			return n;
		return stairsUtilRecursive(n-1)+stairsUtilRecursive(n-2);
	}
	
	

}
//
//		Solution sol=new Solution();
//		int a[]= {4,3,1,2,5,3,4,7,1,9};
//		
//		int ans[]=sol.MaxSumOfAllSubArray(a, 3);
//		for(int x:ans)
//		{
//			System.out.print(x+" ");
//		}
//		int a[]= {12,-1,-7,8,-15,30,4,7};
//		int ans[]=sol.firstNegative(a, 3);
//		for(int x:ans)
//		{
//			System.out.print(x+" ");
//		}
//		
	

	static class Solution{
		public int[] MaxSumOfAllSubArray(int a[],int k) {
			int n=a.length;
			int ans[]=new int[n-k+1];
			if(n==0 || n==1)
				return a;
			Deque<Integer> dq=new LinkedList<>();
			int i=0;
			int j=0;
			int l=0;
			while(j<n) {
				while(!dq.isEmpty() && dq.peekLast()<a[j])
					dq.removeLast();
				dq.addLast(a[j]);
				if(j-i+1<k)
					j++;
				else if(j-i+1==k) {
					ans[l++]=dq.peekFirst();
					if(dq.peekFirst()==a[i])
						dq.removeFirst();
					i++;
					j++;
				}
			}
			
			return ans;
			
		}
		static int[] firstNegative(int a[],int k) {
			int n=a.length;
			int j=0,i=0,l=0;
			ArrayDeque<Integer> ad=new ArrayDeque<>();
			int ans[]=new int[n-k+1];
			while(j<n) {
				if(a[j]<0)
					ad.add(a[j]);
				if(j-i+1<k)
					j++;
				else if(j-i+1==k) {
					if(ad.size()==0)
						ans[l++]=0;
					else
						ans[l++]=ad.peekFirst();
					if(a[i]<0)
						ad.removeFirst();
					i++;
					j++;
				}
			}
			return ans;
			
		}
	}

}
