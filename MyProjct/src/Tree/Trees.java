package Tree;

import java.util.Scanner;

public class Trees {
	static Scanner sc=null;
	static class Node{
		Node left,right;
		int data;
		public  Node(int data) {
			this.data=data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		Node root=createTree();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		inOrder(root);
		
	}
	static Node createTree() {
		Node root=null;
		System.out.println("Enter data:");
		int data=sc.nextInt();
		if(data==-1)
			return null;
		root=new Node(data);
		System.out.println("Enter left for "+data);
		root.left=createTree();
		System.out.println("Enter right for "+data);
		root.right=createTree();
		return root;
	}
	static void preOrder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	static void postOrder(Node root) {
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	static void inOrder(Node root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}
//	static void levelOrder(Node root) {
//		if(root==null)
//			return;
//		preOrder(root.left);
//		System.out.print(root.data+" ");
//		preOrder(root.right);
//		
//	}
	
	
	}


