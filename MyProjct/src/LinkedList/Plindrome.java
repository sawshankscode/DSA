package LinkedList;

public class Plindrome {
	boolean isPalindrome(Node head) 
    {
        try{
        Node temp=getMiddle(head);
        Node t2=new Node(temp.data);
        t2.next=temp.next;
        temp.next=null;
        t2=reverseList(t2);
        temp=head;
        while(temp!=null){
        if(temp.data!=t2.data)
        return false;
        else{
        temp=temp.next;
        t2=t2.next;}}}
        catch(NullPointerException e ){}
        return true;
        
    }    
       static Node getMiddle(Node head) 
    {
        if(head==null)
        return head;
     
        Node fast=head;
        Node slow=head;
        
       while (fast.next!=null && fast.next.next!=null){
           fast=fast.next.next;
           slow=slow.next;
           
       }
       if(fast.next==null)
       return slow;
       
       
       return slow.next;
}
static Node reverseList(Node head)
    {
         if(head.next == null) return head;
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
