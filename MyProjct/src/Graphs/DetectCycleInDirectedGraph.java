package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInDirectedGraph {
	
	public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> list) {
		
		int indegree[]=new int[V];
		
		for(int i=0;i<V;i++) {
			
			for(int node:list.get(i))
				indegree[node]++;
		}
		Queue<Integer> q=new LinkedList<>();
		
		for(int i=0;i<V;i++)
			if(indegree[i]==0)
				q.add(i);
		
		int cnt=0;
		while(!q.isEmpty()) {
			
			int temp=q.poll();
			
			for(int node:list.get(temp)) {
				if(--indegree[node]==0)
					q.add(node);
			}
			cnt++;
			
		
		}
		
		return cnt!=V;
		
	}

}
