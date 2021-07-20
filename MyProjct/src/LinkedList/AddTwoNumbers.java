package LinkedList;

public class AddTwoNumbers {
	static Node addLists(Node first, Node second){
        // code here
        // return head of sum list
        first=reverseList(first);
        second=reverseList(second);
        int carry =0;
        int sum=0;
        Node start=null;
        Node end=null;
        while(first!=null || second!=null){
            int a=first!=null ? first.data:0;
            int b=second!=null? second.data:0;
            sum=carry+(a+b);
            carry=sum>=10? 1:0;
            sum=sum%10;
            if(start==null){
                start=new Node(sum);
                end=start;}
                else
                {
                    end.next=new Node(sum);
                    end=end.next;}
                    if(first!=null)first=first.next;
                    if(second!=null)second=second.next;
                }
                if(carry>0)end.next=new Node(carry);
                start=reverseList(start);
                return start;
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
