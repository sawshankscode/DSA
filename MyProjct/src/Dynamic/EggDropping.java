package Dynamic;
import java.util.*;
public class EggDropping {

	public static void main(String[] args) {
		int e=3;
		int f=10;
		for(int[] i:dp)
			Arrays.fill(i,-1);
		System.out.println(solve(e,f)); 
	}
	static int dp[][]=new int[102][102];

	private static int solve(int e, int f) {
		// TODO Auto-generated method stub
		if(f==1 || f==0 || e==1)
			return f;
		if(dp[e][f]!=-1)
			return dp[e][f];
		
		int min=Integer.MAX_VALUE;
		
		for(int k=1;k<=f;k++) {
			
			int temp= 1+ Math.max(solve(e-1,k-1), solve(e,f-k)); //max of 2 partition bcos worst case is req
			
			min= Math.min(min, temp); //min becos min no of atttempts to find threshold in worst case
		}
		return dp[e][f]=min;
	}
}
