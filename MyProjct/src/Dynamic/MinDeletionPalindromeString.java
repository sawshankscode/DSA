package Dynamic;
import java.util.*;
public class MinDeletionPalindromeString {  //str.length()-lps(longest palindrome subsequence)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="hqghumeaylnlfdxfi";
		int n=str1.length();
		
		for(int i[]:dp)
		Arrays.fill(i,-1);
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		String str2=sb.toString();
		System.out.println(str1.length()-lps(str1,str2,n,n));
		
	}
	static int dp[][]=new int[102][1002];
	
	
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
