package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class BFS {
	 public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
	    {
	        // Code here
	        boolean visited[]=new boolean[V];
	        Queue<Integer> q=new LinkedList<>();
	        ArrayList<Integer> ans=new ArrayList<>();
	        visited[0]=true;
	        q.add(0);
	        while(!q.isEmpty()){
	            int temp=q.poll();
	            ans.add(temp);
	            for(int i:adj.get(temp)){
	                if(!visited[i]){
	                    q.add(i);
	                    visited[i]=true;
	                }
	            }
	        }
	    return ans;
	    }

}
