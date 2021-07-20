package Tree;

public class CousinNodesLCA {
	class Node{
		int data;
		Node left;
		Node right;
	}
	public static boolean isCousin(Node root,int a,int b) {
		Node lca=findLCA( root, a, b);
		int x=findDist(lca,a,0);
		int y=findDist(lca,b,0);
		if(x==y && x>1)
			return true;
		return false;
	
		
	}
	private static int findDist(Node root, int a,int d) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		if(root.data==a)
			return d;
		int x=findDist(root.left, a, d+1);
		if(x!=0)
			return a;
		return findDist(root.right, a, d+1);
	}
	private static Node findLCA(Node root, int a, int b) {
		if(root==null)
			return null;
		if(root.data==a || root.data==b)
			return root;
		Node left=findLCA(root.left, a, b);
		Node right=findLCA(root.right, a, b);
		if(left!=null && right!=null)
			return root;
		return left!=null?left:right;
		
	}
}
