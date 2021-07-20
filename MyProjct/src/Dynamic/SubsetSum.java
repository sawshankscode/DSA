package Dynamic;
import java.util.*;
public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int sum=11;
		int arr[]= {2,3,7,8,10};
		int dp[][]= new int[n+1][sum+1];
		int cnt=solve(arr,n,sum,dp);
		if(cnt>0)
			System.out.println("yes");
		else
			System.out.println("no");
	
	}
	
	public static int solve(int arr[],int n,int sum,int [][]dp) {
		
		
		if(n==0)
			if(sum==0)
				return 1;
			else
				return 0;
		if(dp[n][sum]!=0)
			return dp[n][sum];
		if(arr[n-1]<=sum) {
			 dp[n][sum]=solve(arr,n-1,sum-arr[n-1],dp) + solve(arr,n-1,sum,dp);
		}
		else
			 dp[n][sum]=solve(arr,n-1,sum,dp);
		
		return dp[n][sum];
		
	}

}
