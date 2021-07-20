package Arrays;


import java.util.*;
import java.io.*;

public class Solution {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try	(Scanner sc=new Scanner(System.in)){
		int t=sc.nextInt();
		for(int j=1;j<=t;j++) {
		int n=sc.nextInt();
		int arr[][]=new int [n][n];
		for(int i=0;i<n;i++)
		    for(int x=0;x<n;x++)
		        arr[i][x]=sc.nextInt();
		        int ans=0;
		for(int i=n-1;i>=0;i--){
		    int k=i,l=0;
		     int temp=0;
		    while(k<n && l<n){
		    temp+=arr[k][l];
		    k++;l++;}
		    ans=Math.max(ans,temp);
		}
			System.out.println("Case #"+j+": "+ans);
		}
	}
	}
}