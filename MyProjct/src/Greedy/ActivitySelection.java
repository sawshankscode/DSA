package Greedy;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActivitySelection {				//N MEETINGS IN A ROOM WITH S{I} nd f{i} GIVEN
	static class pair{
        int start;
        int finish;
        int meetingNo;
   }
   
   static class CustomSort implements Comparator<pair>
   {
       public int compare(pair p1,pair p2)
       {
           if(p1.finish>p2.finish) return 1;
           
           return -1;
       }
   }
		public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        int n = Integer.parseInt(br.readLine());
	        int s[] = new int[n];
	        int f[] = new int[n];
	        String s1[] = br.readLine().split(" ");
	        String s2[] = br.readLine().split(" ");
	        
	        for(int i=0;i<n;i++)
	            s[i] = Integer.parseInt(s1[i]);
	            
	            
	        for(int i=0;i<n;i++)
	            f[i] = Integer.parseInt(s2[i]);
	            maxMeetings(s,f,n);
	            System.out.println();
	    }
		}
		
		static void maxMeetings(int s[],int f[],int n)
		{
		   ArrayList<pair>al = new ArrayList<>();
		   for(int i=0;i<n;i++)
		   {
		       pair p = new pair();
		       p.start = s[i];
		       p.finish = f[i];
		       p.meetingNo=i+1;
		       al.add(p);
		       
		   }
		   ArrayList<Integer>res = new ArrayList<>();
		   Collections.sort(al,new CustomSort());
		   
		   int end = Integer.MIN_VALUE;
		  
		   for(int i=0;i<al.size();i++)
		   {
		       pair p = al.get(i);
		        if(p.start >= end)
		       {
		          res.add(p.meetingNo);
		          end = p.finish;
		       }
		      
		   }
		   for(int i=0;i<res.size();i++)
		   System.out.print(res.get(i)+ " ");
		}
}
