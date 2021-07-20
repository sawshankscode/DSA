package com.shawshank;
class Count{
	int count;
	public synchronized void count()
	{
		count++;
	}
}
public class ThreadMisc {
	public static void main(String[] args) throws Exception {
		Count c=new Count();
		Thread t1=new Thread(()->{
		for(int i=0;i<1000;i++) {
			c.count();}});
		Thread t2=new Thread(()->{
			for(int i=0;i<1000;i++) {
				c.count();}});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count is "+ c.count);
		
	}
}
