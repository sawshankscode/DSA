package LinkedList;

class Node{
	int data;
	Node next;
}
class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head)
    {
//         if(head.next == null) return head;
//        Node newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
    	  
        Node curr =head;
        Node next=null,prev=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}

