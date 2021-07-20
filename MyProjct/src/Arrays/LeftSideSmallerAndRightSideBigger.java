package Arrays;


	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class LeftSideSmallerAndRightSideBigger {
		public static void main (String[] args) throws IOException {
			
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
			   int [] max = new int[n];
		     int [] min = new int[n];
		     max[0] = a[0];
		     min[n-1] = a[n-1];
		     for(int i=1;i<n;i++){
		         max[i] = Math.max( max[i-1],a[i] );
		     }
		     for(int i= n-2;i>=0;i--){
		         min[i] = Math.min(a[i],min[i+1]);
		     }
		     int result = -1;
		     for(int i=1;i<n-1;i++){
		         if(max[i]==min[i]){
		             result = max[i];
		             break;
		         }
		     }
		     System.out.println(result);
		     
		 }}}
		 

