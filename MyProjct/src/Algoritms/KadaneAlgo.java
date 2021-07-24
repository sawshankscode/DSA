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
		    solution(a,n);
		    
		}
	}
	static void solution(int a[],int n) {
		int s=0,max_so_far=0,max_till_here=0,start=0,end=0;
		for(int i=0;i<n;i++) {
			max_till_here+=a[i];
			if(max_so_far<max_till_here) {
				max_so_far=max_till_here;
				start=s;
				end=i;
			}
			if(max_till_here<0) {
				max_till_here=0;
				s=i+1;
			}
		}
		System.out.println(max_so_far+" "+start+" "+end);
		}

}
