package LinkedList;

public class Middle {
	 int getMiddle(Node head) 
	    {
	        if(head==null)
	        return head.data;
	     
	        Node fast=head;
	        Node slow=head;
	        
	       while (fast.next!=null && fast.next.next!=null){
	           fast=fast.next.next;
	           slow=slow.next;
	           
	       }
	       if(fast.next==null)
	       return slow.data;
	       
	       
	       return slow.next.data;
	}
}
