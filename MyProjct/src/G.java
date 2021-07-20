import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class G {
	public static int countSum(int arr[], int n, int k) {
		int i=0; int sum=0;
		int l=n-1;
		int c=0;
		while(i<l) {
			sum=arr[i]+arr[l];
			if(sum<k)
				i++;
			else if(sum>k)
				l--;
			else
				c++;
		}
		return c;
	}
		
	


	public static void main (String[] args) {
		//code
//		int t,n,k;
//		
////		List sum=new ArrayList();
////		Scanner sc=new Scanner(System.in);
////		t=sc.nextInt();
////		while(t>0)
////		{
////			n=sc.nextInt();
////			k=sc.nextInt();
////			int arr[]=new int[n];
////			for(int i=0;i<n;i++) {
////				arr[i]=sc.nextInt();
////			}
////			Arrays.sort(arr);
////			sum.add(countSum(arr,n,k));
////			t--;
//		}
//		for(int i=0;i<t;i++) {
//			System.out.println(sum.get(i));
//		}
			int i1 = 5; 
        int i2 = 6; 
        
        String s1 = "7"; 
        System.out.println(5 + 6 + s1); /* Line 8 */
		
	}
}
