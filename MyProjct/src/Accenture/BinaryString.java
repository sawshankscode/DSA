package Accenture;

import java.util.Scanner;
import java.util.*;

public class BinaryString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(binaryOps(str));

	}

	private static int binaryOps(String str) {
		// TODO Auto-generated method stub
//		if(str == null || str.length()==0)
//			return '-1';
		int n=str.length();
		
		char [] chr=str.toCharArray();
		int ans= chr[0]-'0';
		for(int i=1;i<n-1;i+=2) {
			int j=i+1;
			if(chr[i]=='A')
			{
				ans = ans & (chr[j]-'0');
			}
			else if(chr[i]=='B')
			{
				ans = ans | (chr[j]-'0');
			}
			else if(chr[i]=='C')
			{
				ans = ans ^ (chr[j]-'0');
			}
		}
	
		return ans;
	}

}
