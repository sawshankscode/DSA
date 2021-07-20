package LinkedList;

public class PairWiseSwap {
	 public Node pairwiseSwap(Node head)
	    {
	        
	        int d=0;
	        try{
	        Node t1=head;
	        Node t2=head.next;
	        
	        while(t1!=null && t2!=null)
	        {
	            d=t1.data;
	            t1.data=t2.data;
	            t2.data=d;
	            t1=t1.next.next;
	            t2=t2.next.next;
	        }}
	        catch(NullPointerException e){}
	        return head;
	    }
}
