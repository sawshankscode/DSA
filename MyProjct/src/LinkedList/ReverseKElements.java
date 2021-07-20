package LinkedList;

class Node{
	int data;
	Node next;
}
 class ReverseKElements {
	
	public Node reverse(Node root,int k) {
		//iterative
		
		Node next=null,prev=null;
		Node curr=root;
		int cnt=k;
		while(curr!=null && cnt-->0) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		
	if(next!=null) root.next=reverse(next, k);
	return prev;
	}
}
