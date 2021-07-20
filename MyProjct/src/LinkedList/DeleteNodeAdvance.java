package LinkedList;

public class DeleteNodeAdvance {
	Node compute(Node head)
    {
        // your code here
        if(head==null || head.next==null)
            return head;
        Node temp=head;
        try{
        while(temp.next!=null){
            if(temp.data<temp.next.data){
                temp.data=temp.next.data;
                temp.next=temp.next.next;
                temp=head;
            }
            else
            temp=temp.next;
                
        }}
        catch(NullPointerException e){}
        return head;
}
