package Graphs;
import java.util.*;
public class DetectCycleUndirectedGraph {
	 public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
	    {
	        // Code here
	         Boolean visited[] = new Boolean[V];
	        for (int i = 0; i < V; i++)
	            visited[i] = false;

	        // Call the recursive helper 
	        // function to detect cycle in
	        // different DFS trees
	        for (int u = 0; u < V; u++)
	        {  
	        
	            // Don't recur for u if already visited
	            if (!visited[u]) 
	                if (isCyclicUtil(u, visited,adj, -1))
	                    return true;
	        }

	        return false;
	    }
	    static boolean isCyclicUtil(int v,Boolean visited[],ArrayList<ArrayList<Integer>> adj,int parent){
	        visited[v]=true;
	        
	        for(int i:adj.get(v)){
	            if(!visited[i]){
	                if(isCyclicUtil(i,visited,adj,v))
	                    return true;
	            }
	            else if(i!=parent)
	                return true;
	        }
	        return false;
	    }
}
