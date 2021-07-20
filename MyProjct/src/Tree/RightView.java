package Tree;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

import Tree.LeftView.Node;

public class RightView {
	class Node{
		int data;
		Node left,right;
	}

		public static void rightView(Node root) {
			if(root==null)
				return;
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()) {
				Node temp=q.poll();
				System.out.println(temp.data);
				if(temp.right!=null)
					q.add(temp.right);
				else if(temp.left!=null)
					q.add(temp.left);
			}
		}
}
