package Accenture;

import java.util.Arrays;

public class NextGreaterOfSameDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		String A="2345";
		System.out.println(sol(A,n));

	}
	//start from end and find the number x which is smaller than its next number to right.
	//then find smallest number towards right of x which is greater than x. swap these 2.
	//sort numbers next to x. result is next greater number.

	private static String sol(String a, int n) {
		
		
		char ar[]=a.toCharArray();
		 int i;
         
	     
	        for (i = n - 1; i > 0; i--)
	        {
	            if (ar[i] > ar[i - 1]) {
	                break;
	            }
	        }
	         
	     
	       
	            int x = ar[i - 1], min = i;
	             
	         
	            for (int j = i + 1; j < n; j++)
	            {
	                if (ar[j] > x && ar[j] < ar[min])
	                {
	                    min = j;
	                }
	            }
	 
	          
	            swap(ar, i - 1, min);
	 
	         
	            Arrays.sort(ar, i, n);
	            return String.valueOf(ar);
		
	}
	  static void swap(char ar[], int i, int j)
	    {
	        char temp = ar[i];
	        ar[i] = ar[j];
	        ar[j] = temp;
	    }

}
