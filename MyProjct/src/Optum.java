import java.util.Scanner;

public class Optum {

	public static void main(String[] args) {
		// TODO Auto-geint n,k,p;
		
		  
		   Scanner sc=new Scanner(System.in);
		   int t=sc.nextInt();
		   while(t-->0) {
		   int n,k,p=0;
		   n=sc.nextInt();
		   k=sc.nextInt();
		   p=sc.nextInt();
		   
		   int a[]=new int[n];
		   for(int i=0;i<n;i++)
		   a[i]= sc.nextInt();
		    for(int i=0;i<p;i++){
		        int j=minimum(a);
		        if(j>n/2){
		            for(int v=0;v<k;v++)
		                a[j-v]++;
		        }
		        else{
		            for(int v=0;v<k;v++)
		                a[j+v]++;
		        }
		    }
		    System.out.println(a[minimum(a)]);
		   }
		        
		    }
		    public static int minimum(int a[]){
		        int min=0;
		        for(int i=0;i<a.length;i++){
		            if(a[i]<a[min])
		            min=i;
		        }
		        return min;
		    }
		
	}


