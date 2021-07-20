package Arrays;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort0s1sand2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    PriorityQueue<Integer> pq=new PriorityQueue<>();
	
		int n=sc.nextInt();
		//int a[]=new int[n];
		for(int i=0;i<n;i++)
			pq.add(sc.nextInt());
		for(int i=0;i<n;i++)
		System.out.print(pq.poll()+" ");
		System.out.println();
		}
	}

}
