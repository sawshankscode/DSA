package Accenture;

import java.util.Scanner;

public class SumInInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String str= sc.nextLine();
		//System.out.println(calcSum(str));
		char b='1';
		char c='1';
		int a=b;
		 a = a & (c);
		System.out.println(a);
	}

	private static int calcSum(String str) {
		int sum=0;
		char[] chr=str.toCharArray();
		for(int i=0;i<chr.length;i++) {
			if(Character.isDigit(chr[i])) {
				String number="";
				while(i<chr.length && Character.isDigit(chr[i])) {
					number+=chr[i];
					i++;
				}
				sum+=Integer.parseInt(number);
			}
		}
		return sum;
	}

}
