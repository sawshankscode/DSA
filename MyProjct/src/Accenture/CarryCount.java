package Accenture;

import java.util.Scanner;

public class CarryCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int n1=sc.nextInt(),n2=sc.nextInt();
//		System.out.println(countCarry(n1,n2));
		int n=sc.nextInt();
		System.out.println(sol(n));
	}

	private static boolean sol(int n) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
		
	}

	private static int  countCarry(int n1, int n2) {
		// TODO Auto-generated method stub
		int carry=0,count=0;
		while(n1!=0 && n2!=0) {
			int t1=n1%10;
			int t2=n2%10;
			if(t1+t2+carry>9) {
				carry=t1+t2+carry-9;
				count++;
			}
			n1=n1/10;
			n2=n2/10;
			
		}
		return count;
	}

}
