package LinkedList;

public class IntersectY {

	int intersectPoint(Node headA, Node headB)
	{
         Set <Node> s=new HashSet<>();
while(headA!=null)
{

s.add(headA);

headA=headA.next;
}
while(headB!=null){
if(s.contains(headB))
return headB.data;
headB=headB.next;

}
return -1;
	}
}
