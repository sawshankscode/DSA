package Arrays;
import java.io.*;
import java.util.*;
public class TrappingRainWater {
	public static void main (String[] args) throws IOException {
		//code
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        String sizes[] = br.readLine().trim().split("\\s+");
	        int n = Integer.parseInt(sizes[0]);
	        
	        
	        String input[]=br.readLine().trim().split("\\s+");
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	          a[i] = Integer.parseInt(input[i]);
	        System.out.println(solution(a,n));
	}
	br.close();
}
 static int solution(int []arr,int n){
    
    { 
        // initialize output 
        int result = 0; 
  
        // maximum element on left and right 
        int left_max = 0, right_max = 0; 
  
        // indices to traverse the array 
        int lo = 0, hi = n - 1; 
  
        while (lo <= hi) { 
            if (arr[lo] < arr[hi]) { 
                if (arr[lo] > left_max) 
  
                    // update max in left 
                    left_max = arr[lo]; 
                else
  
                    // water on curr element = 
                    // max - curr 
                    result += left_max - arr[lo]; 
                lo++; 
            } 
            else { 
                if (arr[hi] > right_max) 
  
                    // update right maximum 
                    right_max = arr[hi]; 
  
                else
                    result += right_max - arr[hi]; 
                hi--; 
            } 
        } 
  
        return result; 
    } 
             }
             
}
