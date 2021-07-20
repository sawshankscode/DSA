package Dynamic;
import java.util.*;
public class MCMPalindromePartition {
	static int palindromicPartition(String str)
    {
        // code here
        int dp[][]=new int [501][501];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return solve(str.toCharArray(),0,str.length()-1,dp);
    }
    static int solve(char[] x,int i,int j,int [][]dp){
        if(i>=j)
            return 0;
        if(isPalindrome(x,i,j)==true)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j-1;k++){
        	int left=0,right=0;
        	if(dp[i][k]!=-1)
        		 left=dp[i][k];
        	else
        		 left=solve(x,i,k,dp);
        	if(dp[k+1][j]!=-1)
       		 left=dp[k+1][j];
       	else
       		 right=solve(x,i,k,dp);
            int temp=1+left+right;
            if(temp<min)
                min=temp;
        }
        return dp[i][j]=min;
    }
    static boolean isPalindrome(char[] x,int i,int j){
        if(i==j)
            return false;
        if(i>j)
            return false;
        while(i<j){
            if(x[i]!=x[j])
                return false;
            i--;
            j--;
        }
        return true;
    }
}
