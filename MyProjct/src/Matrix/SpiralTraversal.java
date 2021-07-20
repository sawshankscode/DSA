package Matrix;

import java.util.Scanner;

public class SpiralTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		while(t-->0){
			
			int n=scan.nextInt();
			int m=scan.nextInt();
			int a[][]=new int [n][m];
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					a[i][j]=scan.nextInt();
			printSpirally(a,n,m);
			
			
		}
	

	}
	public static void printSpirally(int [][]a,int n,int m) {
		if(n==0)
			return;
		int top=0;
		int bottom=n-1;
		int left=0;
		int right=m-1;
		int id=0;
		while(top<=bottom && left<=right){
			if(id==0) {
				for(int i=left;i<=right;i++)
					System.out.print(a[top][i]+" ");
				top++;
			}
			else if(id==1) {
				for(int i=top;i<=bottom;i++)
					System.out.print(a[i][right]+" ");
				right--;
			}
			else if(id==2) {
				for(int i=right;i>=left;i--)
					System.out.print(a[bottom][i]+" ");
				bottom--;
			}
			else if(id==4) {
				for(int i=bottom;i>=top;i--)
					System.out.print(a[i][left]+" ");
				left++;
			}
			id=(id+1)%4;
		}
		System.out.println();
	}

}
