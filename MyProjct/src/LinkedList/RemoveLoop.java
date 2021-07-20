package LinkedList;

public class RemoveLoop {
	public static void removeLoop (Node head) {
        Set <Node> s=new HashSet<>();
while(head!=null)
{
if(s.contains(head.next))
head.next=null;
s.add(head);

head=head.next;
}

}
}
