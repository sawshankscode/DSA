package com.shawshank;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String V=sc.nextLine();
		//
		int n=Integer.parseInt(sc.nextLine());
		//int n=sc.nextInt();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<n;i++) {
		
			al.add(sc.nextLine());
		}
		for(String a:al)
			System.out.println(check(a,V)==true?"POSITIVE":"NEGATIVE");
		
		
	}

	private static boolean check(String s1, String s2) {
		
		int a=s1.length();
		int b=s2.length();
		int i=0,j=0;
		while(j<a && i<b) {
			if(s1.charAt(j)==s2.charAt(i))
				j++;
			i++;
		}
		return j==a?true:false;
	}

}
