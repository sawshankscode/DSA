
public class MyQueue<E> {
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data)
		{
			this.data=data;
			next=null;
		}
	}

			private Node<E> head,rear;
			public void enqueue(E e) {
				Node<E> toAdd=new Node<>(e);
				if(head==null) {
					head=rear=toAdd;
					return;
				}
				rear.next=toAdd;
				rear=rear.next;
			}
			public E dequeue() {
				Node<E> temp=head;
				if(head==null) {
					head=null;
					return null;
				}
				head=head.next;
				if(head==null) {
					head=rear=null;
				}
				return temp.data;
			}
	}
