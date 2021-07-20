package Arrays;
import java.util.*;
import java.io.*;
public class KthSmallest {
	public static void main (String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader( 
	                new InputStreamReader(System.in));
			int t= Integer.parseInt(br.readLine());
			while(t--!=0) {
				int n= Integer.parseInt(br.readLine());
				int a[]=new int[n];
			    String[] in = br.readLine().trim().split("\\s+");
			    for(int i=0;i<n;i++){
			        a[i]=Integer.parseInt( in[i]);
			    }
			    int k= Integer.parseInt(br.readLine());
			  int l=  solution(a,n,k);
			      System.out.println(l);
			   
			    
			}
		}
		static int solution(int a[],int n,int k){
		   PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		   for(int i=0;i<n;i++) {
			   if(i<k) {
				   pq.add(a[i]);
			   }
			   else {
				   if(a[i]<pq.peek())
				   {
					   pq.poll();
					   pq.add(a[i]);
				   }
			   }
		   }
		   return pq.peek();
		}
}
