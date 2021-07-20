package LinkedList;

public class MergeSortedLists {
	Node sortedMerge(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method
	    
	     
	         if(headA==null)
	         return headB;
	         if(headB==null)
	         return headA;
	      Node headf;
	     if(headA.data<=headB.data){
	    headf=headA;
	    headA=headA.next;}
	    else{
	    headf=headB;
	    headB=headB.next;}
	    Node temp=headf;
	    try{
	     while(headA!=null && headB!=null){
	         if(headA.data<=headB.data){
	             temp.next=headA;
	             
	             headA=headA.next;
	         }
	             else{
	                 temp.next=headB;
	             
	             headB=headB.next;
	             }
	             temp=temp.next;
	         }
	         if( headB!=null)
	         temp.next=headB;
	         else if(headA!=null)
	         temp.next=headA;}
	         catch(NullPointerException e){}
	         return headf;
	         
	     }
}
