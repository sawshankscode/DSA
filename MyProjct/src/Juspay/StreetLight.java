package Juspay;

import java.util.Scanner;

public class StreetLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String in[]=sc.nextLine().trim().split(" ");
		int n=Integer.parseInt(in[0]);
		int k=Integer.parseInt(in[1]);
		int arr[]=new int[n];
		//sc.nextLine();
		char c =sc.nextLine()[0];
		String input[]=sc.nextLine().trim().split("");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(input[i]);
//		res[i]=arr[i];
			
		}
		int res[]=new int[n];
		while(k-->0) {
			for(int i=0;i<n;i++) {
				int index=i>0?i-1:n-1;
				if(arr[index]==1)
					res[i]=arr[i]==1?0:1;
				else
					res[i]=arr[i];
			}
			for(int i=0;i<n;i++)
				arr[i]=res[i];
			
		}
		for(int i=0;i<n;i++)
			System.out.print(res[i]);
		
		
		
		
		
		

	}

}
