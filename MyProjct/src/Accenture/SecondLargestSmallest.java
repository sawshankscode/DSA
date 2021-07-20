package Accenture;
import java.util.*;
public class SecondLargestSmallest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++)
//			arr[i]=sc.nextInt();
		int ch[]={4,7,9,8,0};
		System.out.println(largeSmallSum(ch,5));
	}

	private static int largeSmallSum(int[] arr,int n) {
		// METHOD 1
		int max=0,min=1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				if(arr[i]>=arr[max])
					max=i;
			}
			else {
				if(arr[i]<=arr[min])
					min=i;
			}
		}
		arr[max]=-1;
		arr[min]=1000;
		max=0;min=1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				if(arr[i]>=arr[max])
					max=i;
			}
			else {
				if(arr[i]<=arr[min])
					min=i;
			}
		}
		return arr[max]+arr[min];
		
		//METHOD 2
	
	}

}
