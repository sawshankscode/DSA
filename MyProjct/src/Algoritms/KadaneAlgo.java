package Algoritms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

public class KadaneAlgo {			//SUBARRAY WITH MAX SUM

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( 
                new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t--!=0) {
			int n= Integer.parseInt(br.readLine());
			int a[]=new int[n];
		    String[] in = br.readLine().trim().split("\\s+");
		    for(int i=0;i<n;i++){
		        a[i]=Integer.parseInt( in[i]);
		    }
		    int sum =solution(a,n);
		    System.out.println(sum);
		}
	}
	static int solution(int a[],int n) {
		int max = a[0];
		int current_sum = a[0];
		for(int i = 1; i < n; i++){
		current_sum = Math.max(a[i], current_sum+a[i]);
		max = Math.max(max, current_sum);
		}
		return max;
		}

}
