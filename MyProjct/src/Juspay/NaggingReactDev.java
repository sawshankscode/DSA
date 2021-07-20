package Juspay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NaggingReactDev {
	 static class FastReader{ BufferedReader br;StringTokenizer st;public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}String next(){while (st == null || !st.hasMoreElements()){try{st = new StringTokenizer(br.readLine());}catch (IOException  e){e.printStackTrace();}}return st.nextToken();}int nextInt(){ return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str = ""; try{str = br.readLine(); } catch (IOException e) {e.printStackTrace();} return str; }}
 static FastReader sc = new FastReader();
	  static PrintWriter out = new PrintWriter(System.out);
	  static ArrayList<Integer> ans=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,ArrayList<Integer>> adj=new HashMap<>();
		ArrayList<Integer> mem=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		for(int i =0;i<n;i++) {
			int x=sc.nextInt();
			max=Math.max(max, x);
			adj.put(x,new ArrayList<>());
		}
		
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adj.get(u).add(v);
		}
		int follower=sc.nextInt();
		int following=sc.nextInt();
		
//		for(int i:adj.get(follower) ) {
//			if(i==following)
//				ans.add(follower);
//		}
		//System.out.println(isReachable(adj,follower,following,max+1)?"1":"0");
		Nagg(adj,follower,following,max+1);
		 
			
		

	}

	private static boolean isReachable(Map<Integer,ArrayList<Integer>>  adj, int follower, int following,int n) {
		// TODO Auto-generated method stub
		 boolean visited[]=new boolean[n];
	        Queue<Integer> q=new LinkedList<>();
	        ArrayList<Integer> ans=new ArrayList<>();
	        visited[follower]=true;
	        q.add(follower);
	        while(!q.isEmpty()){
	            int temp=q.poll();
	            for(int i:adj.get(temp)){
	            	if(i==following)
	            		return true;
	                if(!visited[i]){
	                    q.add(i);
	                    visited[i]=true;
	                }
	            }
	        }
	  
		return false;
	}
	private static void Nagg(Map<Integer,ArrayList<Integer>>  adj, int follower, int following,int n) {
		// TODO Auto-generated method stub
		 boolean visited[]=new boolean[n];
	        Queue<Integer> q=new LinkedList<>();
	        ArrayList<Integer> ans=new ArrayList<>();
	        visited[follower]=true;
	        q.add(follower);
	        while(!q.isEmpty()){
	            int temp=q.poll();
	            for(int i:adj.get(temp)){
	            	if(visited[i]!=true) {
	            		if(i==following)
	            			ans.add(temp);
	            		else  {
	            			visited[i]=true;
	            			q.add(i);
	            		}
	               
	                } 
	            }
	        }
	        if(ans.size()==0)
	        	System.out.println(-1);
	        else {
	        Collections.sort(ans);
			for(int i:ans)
				System.out.print(i+" ");
	        }
	      
	  
	}
}


