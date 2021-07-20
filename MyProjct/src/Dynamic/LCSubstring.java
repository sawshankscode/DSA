package Dynamic;

public class LCSubstring {
	static int dp[][]=new int[1002][102];
	public static int lcsubstringRecursive(String x,String y,int n,int m) {
		if(n==0 ||m==0)
			return 0;
		if(dp[n][m]!=-1)
			return dp[n][m];
		if(x.charAt(n-1)==y.charAt(m-1))
			return dp[n][m]=1+lcsubstringRecursive(x, y, n-1, m-1);
		else
			return dp[n][m]=0;        //SUBSTRING CONTINOUS HOTI HAI TOH AGAR MATCH NAHI HUA DONO STRING SE USS POSITION HO NEGLECT KARNA HOGA
									 // WHICH MEANS THAT DP[N][M]=0
	}

}
