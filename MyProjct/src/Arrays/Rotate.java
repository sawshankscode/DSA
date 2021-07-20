package Arrays;

public class Rotate {
	 static void rotateArr(int arr[], int d, int n)
	    {
	        // add your code here
	         d = d % n; 
	        int i, j=0, k, temp=0; 
	        int g_c_d = gcd(d, n); 
	        for (i = 0; i < g_c_d; i++) { 
	            /* move i-th values of blocks */
	            temp = arr[i]; 
	            j = i; 
	            while (true) { 
	                k = j + d; 
	                if (k >= n) 
	                    k = k - n; 
	                if (k == i) 
	                    break; 
	                arr[j] = arr[k]; 
	                j = k; 
	            } 
	            arr[j] = temp; }
	            // for( i=0;i<n;i++)
	            //     System.out.print(arr[i]+" ");
	    }
	    static int gcd(int a,int b){
	        if(b==0)
	            return a;
	        return gcd(b,a%b);
	    }
}
