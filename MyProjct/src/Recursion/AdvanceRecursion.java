package Recursion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AdvanceRecursion {
	static Set<String> set=new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		int a[][]= {{1,1,1,1,1,1,1,1},
////				    {1,1,1,1,1,1,0,0},
////				    {1,0,0,1,1,0,1,1},
////				    {1,2,2,2,2,0,1,0},
////				    {1,1,1,2,2,0,1,0},
////				    {1,1,1,2,2,2,2,0},
////				    {1,1,1,1,1,2,1,1},
////				    {1,1,1,1,1,2,2,1}};
//	Scanner sc=new Scanner(System.in);
//		int t=sc.nextInt();
//	
//		while(t--!=0){
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//	
//		int a[][]=new int[n][m];
//		for(int i=0;i<n;i++)
//		    for(int j=0;j<m;j++)
//		        a[i][j]=sc.nextInt();
//    int r=0;
//    r=sc.nextInt();
//	    int c=0;
//	    c=sc.nextInt();
//	    int toFill=0;
//	    toFill=sc.nextInt();
//	    
//	    floodFill(a,r,c,toFill,a[r][c]);
////	    print(a);
////	    System.out.println();
////	    
////		
////		}}
////	floodFill(a, 4, 3, 3, 2);
//		print(a);}}
//		
		permutation("abc",0,2);
//		int a[]= {1,5,7,3,2,4};
//		System.out.println(coinMax(a, 0, a.length-1));
				    //}
	}
	static public void floodFill(int a[][],int r,int c,int toFill, int prevFill) {	//MATRIX FLOOFFILL
		int rows=a.length;
		int cols=a[0].length;
		if(r<0 || r>=rows || c<0 || c>=cols)
		return;
		if(a[r][c]!=prevFill) return;
		a[r][c]=toFill;
		floodFill(a,r-1,c,toFill,prevFill);
		floodFill(a,r+1,c,toFill,prevFill);
		floodFill(a,r,c+1,toFill,prevFill);
		floodFill(a,r,c-1,toFill,prevFill);
		
	   
	}
	static public void print(int a[][])
	{
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
//			System.out.println();
		}
	}
	static void permutation(String s,int l, int r) {		//STRING PERMUTATIONS
		if(l==r) {
			if(set.contains(s))
				return;
			else {
				set.add(s);
			System.out.println(s);}
		}
		for(int i=l;i<=r;i++) {
			s=interchange(s, l, i);
			permutation(s,l+1,r);
			s=interchange(s,l,i);
		}
		
		
	}
	static String interchange(String s, int a,int b) {
		char array[]=s.toCharArray();
		char temp=array[a];
		array[a]=array[b];
		array[b]=temp;
		return String.valueOf(array);
	}
	static int coinMax(int a[],int l,int r) {		//GAME THEORY VVIP
		if(l+1==r) {
			return Math.max(a[l],a[r]);
		}
		return Math.max(a[l]+ Math.min(coinMax(a,l+2,r), coinMax(a,l+1,r-1)),
						a[r]+Math.min(coinMax(a,l+1,r-1), coinMax(a,l,r-2)));
	}

}
