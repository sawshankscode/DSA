package Tree;

import Tree.Trees.Node;

public class BinaryTreeFromLinkedList {
	
	public static Tree convert(Node head, Tree root) {
		if(head == null) return root;
		Queue<Tree> q = new LinkedList<>();
		root = new Tree(head.data);
		q.add(root);
		head = head.next;
		while(head != null) {
		Tree root1 = q.remove();
		Tree root2 = null , root3 = null;
		root2 = new Tree(head.data);
		q.add(root2);
		if(head.next != null) {
		root3 = new Tree(head.next.data);
		head = head.next;
		q.add(root3);
		}
		root1.left = root2;
		root1.right = root3;
		head = head.next;
		}
		return root;
		}
}
