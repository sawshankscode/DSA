package Tree;
import java.util.*;
public class BottomView { //preorder traversal and height is also calculated basically element with same hd but maximum height will be printed
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
		}
	}
	static class pair{
		int d,h;
		public pair(int d,int h) {
			this.d=d;
			this.h=h;
		}
	}
	static Map<Integer,pair> map=new HashMap<>();
	 static void bottomView(Node root) {
		
		preOrder(root,0,0);
		
	}
	static void preOrder(Node root,int hd,int height) {
		if(root==null) return;
		if(map.get(hd)==null || height>=map.get(hd).h)
			map.put(hd,new pair(root.data,height));
		preOrder(root.left,hd-1,height+1);
		preOrder(root.right,hd+1,height+1);
	}

}
