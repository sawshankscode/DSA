package Dynamic;

public class LPS {
	static int dp[][]=new int[1002][102];
	public static int lps(String x,String y,int n,int m) { //HERE N==M AND STRING Y IS REVERSED STRING X
		if(n==0 ||m==0)
			return 0;
		if(dp[n][m]!=-1)
			return dp[n][m];
		if(x.charAt(n-1)==y.charAt(m-1))
			return dp[n][m]=1+lps(x, y, n-1, m-1);
		else
			return dp[n][m]=Math.max(lps(x, y, n-1, m), lps(x, y, n, m-1));
	}

}
