package Dynamic;

import java.util.ArrayList;

public class MinSubsetSumDiff {        //KNAPSACK VARIATION     S1-S2=MIN      FIND POSSIBLE S1 THEN MINIMISE RANGE-2*S1
 public int minSub(int arr[],int n,int range) { //range is sum of array elements
	 boolean t[][]=new boolean[n+1][range+1];
	 for(int i=0;i<n+1;i++)
		 t[i][0]=true;
	 for(int j=1;j<range+1;j++)
		 t[0][j]=false;
	 for(int i=1;i<n+1;i++)
		 for(int j=1;j<range+1;j++) {
			 if(arr[i]<=j) {
				 t[i][j]=t[i-1][j-arr[i]]||t[i-1][j-1];
			 }
			 else
				 t[i][j]=t[i-1][j-1];
		 }
//	 ArrayList<Integer> v=new ArrayList<>();
//	 for(int i=0;i<=range/2;i++)      //GOING TIL HALF OF LAST ROW BCOS REST HALF WILL BE S2
//		 if(t[n][i]==true)          //LAST ROW OF T GIVES POSSIBLE S1 FOR WHOLE ARRAY
//			 v.add(i);
//	 int min=Integer.MAX_VALUE;
//	 for(int i=0;i<v.size();i++)
//		 if(range-2*v.get(i)<min)
//			 min=range-2*v.get(i);
//	return min;
	 int diff=Integer.MAX_VALUE;
	   for (int j = range / 2; j >= 0; j--) 
      { 
          // Find the  
          if (t[n][j] == true) 
          { 
              diff = range - 2 * j; 
              break; 
          } 
      } 
      return diff;
 }
}
