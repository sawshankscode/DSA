package Tree;

public class ChildrenSumParent {
	class Node{
		int data;
		Node left;
		Node right;
	}
	
	public static int  isSum(Node root) {
		if(root==null)
			return 1;
		if(root.left==null && root.right==null)
			return 1;
		if(root.left!=null && root.right!=null) {
			if(root.data==root.left.data+root.right.data) {
				if(isSum(root.left)==0 || isSum(root.right)==0)
					return 0;
			}
			else
				return 0;
		}
		else if(root.left!=null) {
			if(root.data==root.left.data) {
				if(isSum(root.left)==0)
					return 0;
			}
			else
				return 0;	
		}
		else if(root.right!=null) {
			if(root.data==root.right.data) {
				if(isSum(root.right)==0)
					return 0;
			}
			else
				return 0;
		}
					
				
		
		return 1;
		
	}
}
