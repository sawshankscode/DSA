package Tree;
import java.util.*;
public class TopView { //VERTICAL OREDER TRAVERSAL WILL BE DONE HERE 
	class Node{
		int data;
		Node left,right;
	}
	public static void topView(Node root) {
		ArrayDeque<Node> aq=new ArrayDeque<>();
		TreeMap<Integer,Integer> tm=new TreeMap<>();
		HashMap<Node,Integer> hm=new HashMap<>();
		aq.add(root);
		int dist=0;
		hm.put(root, dist);
		while(!aq.isEmpty()) {
			Node temp=aq.poll();
			dist=hm.get(temp);
			if(!tm.containsKey(dist))
				tm.put(dist, temp.data);
			if(temp.left!=null) {
				hm.put(temp.left,dist-1);
				aq.add(temp.left);
		}
			if(temp.right!=null) {
				hm.put(temp.right,dist+1);
				aq.add(temp.right);
		}
		
	}
		for(Map.Entry<Integer,Integer> e:tm.entrySet()) {
			System.out.println(e.getValue()+" ");
		}
}
}
