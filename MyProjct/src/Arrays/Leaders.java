package Arrays;


	import java.util.*;
	import java.lang.*;
	import java.io.*;
	public class Leaders {
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
		          solution(a,n);
		          StringBuffer sb = new StringBuffer(); 
			      for(int i=0;i<n;i++){
			          if(a[i]!=-1)
			          sb.append(a[i] + " ");
			      }
			      System.out.println(sb);
		         
		}
		br.close();
	}
	        static void solution(int []a,int n){
	            int max=a[n-1];
	            for(int i=n-2;i>=0;i--){
	                if(a[i]>=max)
	                    max=a[i];
	                else
	                a[i]=-1;
	                }
	            }
	        }

