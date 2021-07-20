package LinkedList;

public class swapKthNodefromEnds {
	 Node swapkthnode(Node head, int n, int K)
	    {
	        if(K > n)
	        {
	            return head;
	        }
	        
	        Node x = head, xprev = null;
	        int k = K;
	        
	        while(x != null && k-- > 1)
	        {
	            xprev = x;
	            x = x.next;
	        }
	        
	        Node y = head, yprev = null;
	        k = n - K + 1;
	        
	        while(y != null && k-- > 1)
	        {
	            yprev = y;
	            y = y.next;
	        }
	        
	        if(x == head) //if x is head
	        {
	            Node xnxt = x.next;
	            x.next = null;
	            yprev.next = x;
	            y.next = xnxt;
	            head = y;
	        }
	        else if(y == head) //if y is head
	        {
	            Node ynxt = y.next;
	            y.next = null;
	            xprev.next = y;
	            x.next = ynxt;
	            head = x;
	        }
	        else if(yprev == x) //x and y are adjacent, x is before y
	        {
	            Node ynxt = y.next;
	            y.next = null;
	            x.next = null;
	            xprev.next = y;
	            x.next = ynxt;
	            y.next = x;
	        }
	        else if(xprev == y) ////x and y are adjacent, y is before x
	        {
	            Node xnxt = x.next;
	            x.next = null;
	            y.next = null;
	            yprev.next = x;
	            y.next = xnxt;
	            x.next = y;
	        }
	        else if(x == y) //x and y are same 
	        {
	            //do nothing
	        }
	        else //not adjacent
	        {
	            Node xnxt = x.next;
	            Node ynxt = y.next;
	            x.next = null;
	            y.next = null;
	            xprev.next = y;
	            yprev.next = x;
	            x.next = ynxt;
	            y.next = xnxt;
	        }
	        
	        return head;
	    }
}
