package LinkedList;

public class CloneLInkedList {
	
	class Node {
	    int data;
	    Node next, arb;

	    Node(int d) 
	    { 
	        data = d;
	        next = arb = null; 
	        
	    }
	}
	Node copyList(Node head) {
	    Node curr = head, clone, node;
	    while (curr != null) {
	        node = new Node(curr.data);
	        node.next = curr.next;
	        curr.next = node;
	        curr = node.next;
	    }
	    curr = head;
	    while (curr != null) {
	        if (curr.arb != null) curr.next.arb = curr.arb.next;
	        curr = curr.next.next;
	    }
	    curr = head;
	    node = clone = head.next;
	    while (node.next != null) {
	        curr.next = node.next;
	        curr = curr.next;
	        node.next = curr.next;
	        node = curr.next;
	    }
	    curr.next = null;
	    return clone;
}
	}
