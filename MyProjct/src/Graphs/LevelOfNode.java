package Graphs;

import java.util.*;

public class LevelOfNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int levelOfX(int V, ArrayList<ArrayList<Integer>> adj, int X) 
	    {
	        int l=0;
	        boolean vis[]=new boolean[V];
	        Queue<Integer> q=new LinkedList<>();
	        q.add(0);
	        while(!q.isEmpty()) {
	        	int len=q.size();
	        	while(len-->0) {
	        	
	        		int u=q.poll();
	        		if(u==X)
	        			return l;
	        		for(int v:adj.get(u))
	        			if(!vis[v])
	        				q.add(v);
	        	}
	        	l++;
	        }
	        return l;
	    }

}
