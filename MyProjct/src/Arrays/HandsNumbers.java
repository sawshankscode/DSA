package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HandsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[10];
//		Arrays.fill(arr,0);
//		int o=n%10;
//		arr=right(arr,o);
//		n=n/10;
//		int t=0;
//		if(n>0) {
//			t=n%10;
//			arr=left(arr,t);
//		}
//		for(int i=0;i<10;i++)
//			System.out.print(arr[i]);
//		try {
//			int i,sum; sum=10;
//			for(i=-1;i<3;++i) {
//				sum=(sum/i);
//			//	System.out.println(sum);
//		}
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0");
//		}
		int i=257;
		byte b;
		b=(byte)i;
		System.out.println(b);
	}

	private static int[] right(int[] arr, int o) {
		if(o<=5) {
			for(int i=9;i>=(10-o);i--)
				arr[i]=1;
		}
		else {
			arr[5]=1;
			int x=o-5;
			int i=9;
			while(x-->0) {
				arr[i--]=1;
			}
		}
		return arr;
	}

	private static int[] left(int[] arr, int t) {
		if(t<=5) {
			for(int i=0;i<t;i++)
				arr[i]=1;
		}
		else {
			arr[4]=1;
			int x=t-5;
			int i=0;
			while(x-->0) {
				arr[i++]=1;
			}
		}
		return arr;
	}

}
