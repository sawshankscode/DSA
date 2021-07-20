package Tree;

public class RemoveHalfNode {
	class Node{
		int data;
		Node left;
		Node right;
	}
	public static Node RemoveHalfNodes(Node root)
    {
        // Code Here         post order traversal
        if(root == null) 
            return root;
        Node curr1 = RemoveHalfNodes(root.left);
        Node curr2 = RemoveHalfNodes(root.right);
        if(curr1 == null && curr2 != null) {
            root.right = null;
            return curr2;
        }
        else if(curr2 == null && curr1 != null) {
            root.left = null;
            return curr1;
        }
        else if(curr1 != null && curr2 != null) {
            root.left = curr1;
            root.right = curr2;
            return root;
        }
        else 
            return root;
        }
}
