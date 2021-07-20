package Accenture;

import java.util.Scanner;

public class ReplaceStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		char ch1=sc.nextLine().charAt(0);
		char ch2=sc.nextLine().charAt(0);
		System.out.println(replaceChar(str,ch1,ch2));

	}

	private static String replaceChar(String str, char ch1, char ch2) {
		// TODO Auto-generated method stub
//		if(str==null)
//			return null;
//		char[] chr=str.toCharArray();
//		for(int i=0;i<chr.length;i++) {
//			if(chr[i]==ch1)
//				chr[i]=ch2;
//			else if(chr[i]==ch2)
//				chr[i]=ch1;
//	}
		str=str.replace(ch1,ch2);
		 str=str.replace(ch2,ch1);
			
		
		return str;
	}

}
