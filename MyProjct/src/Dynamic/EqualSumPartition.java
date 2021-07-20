package Dynamic;

public class EqualSumPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int arr[]= {1,2,3,8};
		int sum=0;
		for(int i:arr)
			sum+=i;
		int dp[][]= new int[n+1][sum/2+1];
		System.out.println(solve(arr,n,sum/2,dp)==2?"True":"False");

	}

	private static int solve(int[] arr, int n, int sum,int[][] dp) {
		// TODO Auto-generated method stub
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
