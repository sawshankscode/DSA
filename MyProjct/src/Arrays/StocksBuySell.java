package Arrays;


	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class StocksBuySell {
		public static void main (String[] args) throws IOException {
			//code
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
			   
			  //  List<Integer> pro=new ArrayList<>();
			    solution(a,n);
			  //  if(pro.isEmpty()){
			  //  System.out.println("No Profit"); }
			  //  else{
			  //  for(int i=0;i<pro.size()-1;i+=2){
			  //      System.out.print("("+pro.get(i)+","+pro.get(i+1)+") ");
			  //  }
			    System.out.println();}
			}
			static void solution(int[]a,int n){
			    int start =0;
			    int end=0;
			    int i=0;
			    boolean noprofit=true;
			   while(i<n-1){
			      
			         if(a[i+1]<a[i]){
			            
			            end=i;
			            if(start<end)
			            {
			                System.out.print("("+start+","+end+") ");
			                noprofit=false;
			                start=i+1;
			            }
			            else{
			                start=i+1;
			                i=start;
			               
			            }
			                
			            }
			            else {
			            	 i++;
			        if(i==n-1 && end<start) {
			        	System.out.print("("+start+","+i+") "); 
			        	noprofit=false;
			        	break;
			        	}
			          }
			        }
			  //       if(result.isEmpty()){
			  //  System.out.print("No Profit"); }
			  //  else{
			  //  for(int x=0;x<result.size()-1;x+=2){
			  //      System.out.print("("+result.get(x)+","+result.get(x+1)+") ");
			  //  }
			  //  }
			   
		}
			 public void stockBuySell(int[] price, int n) {
			        // code here
			         StringBuffer sb=new StringBuffer();
			        int i=0;
			        while(i<n)
			        {
			           int j=i;
			           while(j<n-1 && price[j]<=price[j+1])//for buying point i find selling point j
			           j++;
			           while(i<j && price[i]==price[i+1])//if we have same buying points eg: 1 1 2 2 3 3 ans:(1,5)
			            i++;
			           if(i<j)    //if we can buy but cannot sell then we doesnot have an interval
			           sb.append("("+i+" "+j+") ");
			           i=j+1;
			        }
			        if(sb.length()>0)
			         System.out.println(sb);       
			        else
			        System.out.println("No Profit");// if there is no interval then there is no profit
			    }}

