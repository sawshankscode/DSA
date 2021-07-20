package twoPointers;
import java.util.*;
public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={-1 ,2 ,1, -4};
		System.out.println(threeSumClosest(A,1));
	}
	
	    public static int threeSumClosest(int[] A, int B) {
	    	
	    	Arrays.sort(A);
	    	int n=A.length;
	    	int result=A[0]+A[1]+A[n-1];
	    	
	    	for(int i=0;i<n;i++) {
	    		int low=i+1,high=n-1;
	    		while(low<high) {
	    			int sum=A[i]+A[low]+A[high];
	    			if(sum>B)
	    				high--;
	    			else
	    				low++;
	    			if(Math.abs(sum-B)<Math.abs(result-B))
	    				result=sum;
	    		}
	    	}
	    	return result;
	    
	    }

}
