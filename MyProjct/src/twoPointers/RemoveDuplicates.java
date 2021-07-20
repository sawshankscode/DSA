package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,3,3,4,4,4,4};
		System.out.println(removeDuplicate(arr));
		
	}

	private static int removeDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int i=1,j=0;
		while(j<n && i<n) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		i++;
		
	}
		return j+1;
		}
		
	}


