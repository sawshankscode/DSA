

public class MyDeque<E> {
	static class Node<E>{
		E data;
		Node<E> next,prev;
		
		public Node(E data)
		{
			this.data=data;
			this.next=this.prev=null;
		}
	}
	Node<E> head,tail;
	public void addFirst(E e) {
		Node<E> toAdd=new Node<>(e);
		if(head==null) {
			head=tail=toAdd;
			return;
		}
		head.next=toAdd;
		toAdd.prev=head;
		head=toAdd;
		
	}
	public E  removeFirst() {
		if(head==null) {
			return null;
		}
		Node<E> toRemove=head;
		head=head.prev;
		head.next=null;
		if(head==null)
			tail=null;
		return toRemove.data;
	}
	public E removeLast() {
		
		if(head==null) {
			return null;
		}
		Node<E> toRemove=tail;
		tail=tail.next;
		tail.prev=null;
		if(tail==null) {
			head=null;
		}
		return toRemove.data;
	}
}
