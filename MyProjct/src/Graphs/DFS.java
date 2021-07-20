package Graphs;

import java.util.ArrayList;

public class DFS {
	 public  ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
	    {
	        ArrayList<Integer> ans =new ArrayList<Integer>();
	        boolean visited[]=new boolean[V];
	        dfs(0,adj,visited,ans);
	        return ans;
	    }
	    static void dfs(int node, ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> ans){
	        
	        visited[node]=true;
	        ans.add(node);
	        for(int i:adj.get(node)){
	            if(!visited[i]){
	                dfs(i,adj,visited,ans);
	            }
	        }
	    }
}
