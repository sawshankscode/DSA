package Arrays;
import java.util.*;
import java.io.*;
public class ReverseArrayInGroups {
	public static void main (String[] args) throws IOException{
		//code
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        String sizes[] = br.readLine().trim().split("\\s+");
	        int n = Integer.parseInt(sizes[0]);
	        int k= Integer.parseInt(sizes[1]);
	        
	        String input[]=br.readLine().trim().split("\\s+");
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	          a[i] = Integer.parseInt(input[i]);
	          reverseArray(a,n,k);
	          StringBuffer sb = new StringBuffer(); 
		      for(int i=0;i<n;i++){
		          sb.append(a[i] + " ");
		      }
		      System.out.println(sb);
	 }
	 br.close();
	          
	         
	}
	
	static void reverseArray(int[]a , int n, int k) {
	  for (int i = 0; i < n; i+=k) {
	      int left = i;
	      int right = Math.min(i+k-1, n-1);
	      int temp;
	      while (left < right) {
	          temp = a[left];
	          a[left] = a[right];
	          a[right] = temp;
	          left++;
	          right--;
	      }
	  }
	  
	  
}
}
