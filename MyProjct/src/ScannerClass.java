import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;


import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.IntStream; 
 

	

class Shivani
{
	public static int[] swap(int a[],int j) {
		List<Integer> arrayList = IntStream.of(a) 
                .boxed() 
                .collect(Collectors.toList()); 
		arrayList.remove(j); 
		return arrayList.stream() 
	            .mapToInt(Integer::intValue) 
	            .toArray(); 
	}
	public  int sum(int a[],int n)
	{
		
		int sum=0;
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<n;j++)
			{
				if(a[j]==(a[i]-1))
				{
					a=swap(a,j);
					n--;
					
					
					}
				}
			
			}
		
			
		
		for(int i:a)
		{
			sum=sum+i;
		}
		return sum;
	}
}
 class ScannerClass {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shivani s=new Shivani();
	 int t= sc.nextInt();
	 int n=sc.nextInt();
	 int a[] =new int[n];
	 int d[]=new int[t];
	for(int v=0;v<t;v++)
	 {
	
		 
			
			 for(int i=0;i<n;i++)
			 {
				 a[i]=sc.nextInt();			 
			 
			 }
			Arrays.sort(a);
			
		
		
		 d[v]=s.sum( a, n);
	 }
	for(int i:d)
		System.out.print(i+" ");
	 
	}
}

			 
		 
	
	
		
		

