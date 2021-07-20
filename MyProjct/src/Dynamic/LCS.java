package Dynamic;

public class LCS {
	
	static int dp[][]=new int[1002][102];
	public static int lcsRecursive(String x,String y,int n,int m) {
		if(n==0 ||m==0)
			return 0;
		if(dp[n][m]!=-1)
			return dp[n][m];
		if(x.charAt(n-1)==y.charAt(m-1))
			return dp[n][m]=1+lcsRecursive(x, y, n-1, m-1);
		else
			return dp[n][m]=Math.max(lcsRecursive(x, y, n-1, m), lcsRecursive(x, y, n, m-1));
	}

}
