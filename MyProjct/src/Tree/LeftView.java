package Tree;
import java.util.*;
import java.util.LinkedList;

public class LeftView {
	class Node{
		int data;
		Node left,right;
	}

		public static void leftView(Node root) {
			if(root==null)
				return;
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()) {
				Node temp=q.poll();
				System.out.println(temp.data);
				if(temp.left!=null)
					q.add(temp.left);
				else if(temp.right!=null)
					q.add(temp.right);
			}
		}
}
