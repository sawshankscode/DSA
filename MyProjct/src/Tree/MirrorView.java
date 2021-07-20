package Tree;
class Node{
	int data;
	Node left;
	Node right;
}
public class MirrorView {
	void mirror(Node root) {
		if(root==null)
			return;
			mirror(root.left);
			mirror(root.right);
			Node temp=root.left;
			root.left=root.right;
			root.right=temp;
	}

}
