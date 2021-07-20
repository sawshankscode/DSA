package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

public class MergeWithoutExtraSpace { 		//DIVIDE METHOD COMPLEXITY O(M+N)O(log(M+N))

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( 
                new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int t= Integer.parseInt(br.readLine());
		while(t--!=0) {
			int n= sc.nextInt();
			int m=sc.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[m];
		    String[] in = br.readLine().trim().split("\\s+");
		    for(int i=0;i<n;i++){
		        arr1[i]=Integer.parseInt( in[i]);
		    }
		    String[] in2 = br.readLine().trim().split("\\s+");
		    for(int i=0;i<m;i++){
		        arr2[i]=Integer.parseInt( in2[i]);
		    }
		    solution(arr1,arr2,n,m);
		    System.out.println();
		    
	}

}
	static void solution(int arr1[],int arr2[],int n,int m) {
	int gap=(n+m)/2+(n+m)%2;
	int j=0;
	while(gap!=1) {
	for(int i=0;i<n;i++) {
		if(i+gap<=n) {
			if(arr1[i+gap-1]<arr1[i]) {
				int temp=arr1[i];
				arr1[i]=arr1[i+gap-1];
				arr1[i+gap-1]=temp;
			}
			
		}
		else {
		if(arr1[i]>arr2[j]) {
			int temp=arr1[i];
			arr1[i]=arr2[j];
			arr2[j]=temp;
			}
		if(j!=m-1)
		j++;
	}}
	for(int i=0;i<m;i++) {
		if(i+gap<=m) {
			if(arr2[i+gap-1]<arr2[i]) {
				int temp=arr2[i];
				arr2[i]=arr2[i+gap-1];
				arr2[i+gap-1]=temp;
			}
		}
	}
	gap=gap/2+gap%2;
	j=0;
	}
	for(int i:arr1)
		System.out.print(i+" ");
	for(int i:arr2)
		System.out.print(i+" ");
}
}
	