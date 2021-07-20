package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeChef {
	
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			try{
			    Scanner sc=new Scanner(System.in);
			    int t=sc.nextInt();
			    while(t-->0){
			        int n=sc.nextInt();
			       int a[]=new int[n];
			        for(int i=0;i<n;i++)
			            a[i]=sc.nextInt();
			       ArrayList<Integer> ans=new ArrayList<>();
			        for(int i=0;i<n;i++)
			           ans.add(a[i]);
			        int i=0,j=n-1;
			        
			        while(ans.size()>1 && i!=j ){
			            if(i<j){
			            if(ans.get(i)>ans.get(j)){
			                ans.remove(i);
			                ans.remove(j-1);
			                j=ans.size()-1;
			            }
			            else{
			                j--;
			            }
			        }
			        else{
			        i++;
			        j=ans.size()-1;}
	            	}
	            	if(ans.size()>1)
	            	    System.out.println("NO");
	            	  else
	            	    System.out.println("YES");
		        
	}
	}
	catch(Exception e){return;}
	}
	}


