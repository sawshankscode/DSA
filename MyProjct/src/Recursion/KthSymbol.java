package Recursion;

public class KthSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(4,4));

	}

	private static int solve(int n, int k) {
		// TODO Auto-generated method stub
		if(n==1 && k==1)
			return 0;
		int length=(int)Math.pow(2, n-1);
		int mid=length/2;
		if(k<=mid)
			return solve(n-1,k);
		else
			return solve(n-1,k-mid)==0?1:0;
		
	}

}
