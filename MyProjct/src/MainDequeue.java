import java.util.PriorityQueue;
import java.util.Scanner;

public class MainDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyDeque<Integer> md=new MyDeque<>();
//		md.addFirst(12);
//		md.addFirst(20);
//		md.addFirst(11);
//		System.out.println(md.removeFirst());
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(4);
		pq.offer(3);
		pq.offer(7);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	}

}
