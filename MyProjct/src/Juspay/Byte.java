package Juspay;
import java.io.*;
import java.util.Stack;
public class Byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String obj="abc";
//		byte b[]=obj.getBytes();
//		ByteArrayInputStream obj1=new ByteArrayInputStream(b);
//		for(int i=0;i<2;++i) {
//			int c;
//			while((c=obj1.read())!=-1) {
//				if(i==0) {
//					System.out.print(Character.toUpperCase((char)c));
//					obj1.write(1);
//				}
//			}
//			System.out.print(obj1);
//		}
//		try {
//			System.out.print("A");
//			throw new NullPointerException("Hallo");
//		}
//		catch(ArithmeticException e) {
//			System.out.print("B");
//		}
		f(16);
//		Stack<Integer> s=new Stack<>();
//		int n=6;
//		while(n>0) {
//			s.push(n%2);
//			n=n/2;
//			
//		}
//		while(!s.isEmpty()) {
//			System.out.print(s.pop());
//		}

	}

	private static void f(int n) {
		// TODO Auto-generated method stub
		int p,q,i,j,k=0;
		q=0;
		for(i=1;i<n;++i) {
			p=0;
			for(j=n;j>1;j=j/2) 
				++p;
			for(k=1;k<p;k=k*2)
				++q;
			
		}
		System.out.println(q);
	}

}
