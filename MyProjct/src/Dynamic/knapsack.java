package Dynamic;

import java.util.Arrays;

public class knapsack {

	 public static void main(String args[]) {
	        int w = 10;
	        int n = 4;
	        int[] val = {20, 30, 10, 50};
	        int[] wt = {1, 3, 4, 6};

	        // Populate base cases
	       int[][] mat = new int[n + 1][w + 1]; //dp matrix
	        for (int r = 0; r < w + 1; r++) {
	            mat[0][r] = 0;
	        }
	        for (int c = 0; c < n + 1; c++) {
	            mat[c][0] = 0;
	        }
	        
	        // Main logic
	        for (int item = 1; item <= n; item++) {
	            for (int capacity = 1; capacity <= w; capacity++) {
	                int maxValWithoutCurr = mat[item - 1][capacity]; // This is guaranteed to exist
	                int maxValWithCurr = 0; // We initialize this value to 0
	                
	                int weightOfCurr = wt[item - 1]; // We use item -1 to account for the extra row at the top
	                if (capacity >= weightOfCurr) { // We check if the knapsack can fit the current item
	                    maxValWithCurr = val[item - 1]; // If so, maxValWithCurr is at least the value of the current item
	                    
	                    int remainingCapacity = capacity - weightOfCurr; // remainingCapacity must be at least 0
	                    maxValWithCurr += mat[item - 1][remainingCapacity]; // Add the maximum value obtainable with the remaining capacity
	                }
	                
	                mat[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr); // Pick the larger of the two
	            }
	        }
	        
	        System.out.println(mat[n][w]); // Final answer
	        System.out.println(Arrays.deepToString(mat)); // Visualization of the table
	    }
	 static int dp[][]=new int[1002][102];
	  static int  knapsackRecursive( int wt[],int val[],int W,int N) { //RECURSIVE MEMOISED SOLUTION
		  if(N==0 ||W==0)
			  return 0;
		  if(dp[N][W]!=-1)
			  return dp[N][W];
		  else if(wt[N-1]<=W)
			  return dp[N][W]=Math.max(val[N-1]+knapsackRecursive(wt, val, W-wt[N-1], N-1), knapsackRecursive(wt, val, W, N-1));
		  else if(wt[N-1]>W)
			  return dp[N][W]=( knapsackRecursive(wt, val, W, N-1));
			  
		  return 0;
		 
	 }
}

