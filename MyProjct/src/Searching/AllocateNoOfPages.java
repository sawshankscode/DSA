package Searching;

import java.util.*;

public class AllocateNoOfPages {  //LARGEST MINIMUM 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {73, 58, 30, 72, 44, 78, 23, 9};
			System.out.println(solution(arr,8,5));
	}
	public static int solution(int arr[],int n,int k) {
		//Arrays.sort(arr);
		int start=0;
		int end=0;
		int res=-1;
		for(int i:arr)
			end+=i;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(isValid(arr,n,k,mid)==true) {
				res=mid;
				end=mid-1;
			}
			else
				start=mid+1;
		}
		return res;
	}
	public static boolean isValid(int []arr,int n,int k,int max) {
		int std=1;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(sum>max) {
				std++;
				sum=arr[i];
			}
			if(std>k)
				return false;
		}
		return true;
	}
	public static int solution2(int arr[],int n,int k) {
		Arrays.sort(arr);
		int start=arr[0];
		int end=arr[n-1];
		int res=-1;
		
		while(start<end) {
			int mid=start+(end-start)/2;
			if(isValid2(arr,n,k,mid)==true) {
				res=Math.max(mid, res);
				start=mid+1;
			}
			else
				end=mid-1;
		}
		return res;
	}
	public static boolean isValid2(int []arr,int n,int k,int max) {
		int pos = arr[0];
		 
	    // Initialize count of elements placed.
	    int elements = 1;
	 
	    // Try placing k elements with minimum
	    // distance mid.
	    for (int i=1; i<n; i++)
	    {
	        if (arr[i] - pos >=max)
	        {
	            // Place next element if its
	            // distance from the previously
	            // placed element is greater
	            // than current mid
	            pos = arr[i];
	            elements++;
	 
	            // Return if all elements are 
	            // placed successfully
	            if (elements == k)
	            return true;
	        }
	    }
	    return false;

}
}
