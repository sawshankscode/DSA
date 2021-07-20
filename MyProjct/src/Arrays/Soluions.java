package Arrays;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;
public class Soluions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			ArrayList<Integer> arr=new ArrayList<>();
			ArrayDeque<Integer> q=new ArrayDeque<>();
			for(int i=0;i<n;i++)
				arr.add(sc.nextInt());
			for(int i=0;i<n;i++)
				q.addLast(arr.get(i));
			ArrayList<Integer> ans=new ArrayList<>();
			Map<Integer,Integer> map=new HashMap<>();
			int c=q.size();
		   while(!q.isEmpty() && c!=0) {
			   if(q.peekFirst()>x) {
				   c--;
				   int temp=q.pollFirst();
				   q.addLast(temp);
			   }
			   else {
				   c--;
				   int temp=q.pollFirst();
				   ans.add(arr.indexOf(temp)+1);
			   }
			   if(!q.isEmpty() && c==0) {
				   c=q.size();
				   x=2*x;
			   }
		   }
		   System.out.print("Case #"+t+":"+" ");
		   for(int i=0;i<n;i++)
			   System.out.print(ans.get(i)+" ");
		  System.out.println();
		  t--;
		}
	}
		catch(Exception e) {return;}
	}
}
