package LinkedList;

public class Rotate {
	 public Node rotate(Node head, int k) {
	        int n=1;
	          Node temp=head;
	          
	          try{
	        while(n!=k){
	            
	            if(head==null || head.next==null)
	            return temp;
	            n++;
	            head=head.next;
	        }
	        if(head.next==null)
	        return temp;
	        Node ini=head.next;
	        head.next=null;
	        head=ini;
	        while(ini.next!=null)
	        {
	            ini=ini.next;}
	            ini.next=temp;}
	            catch (NullPointerException e){}
	            return head;
	          
	        }
}
