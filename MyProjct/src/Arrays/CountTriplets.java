package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		        a[i]=sc.nextInt();
		        Arrays.sort(a);
		        int l=solution(a,n);
		        System.out.println(l);
		}
	}
	static int solution(int a[],int n){
	    Set<Integer> s=new HashSet<>();
	    int l=0;
	    
	    for(int i:a)
	    s.add(i);
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(s.contains(a[i]+a[j]))
	            l++;
	        }
	    }
	    
	    if(l>0)
	    return l;
	    else
	    return -1;
	}

}
