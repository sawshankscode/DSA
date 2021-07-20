package Arrays;
import java.io.*;
import java.util.*;
public class PythaTriplet {
	public static void main (String[] args)throws IOException {
		//code
		
	BufferedReader br = new BufferedReader( 
                new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t--!=0) {
			int n= Integer.parseInt(br.readLine());
			int a[]=new int[n];
		    String[] in = br.readLine().trim().split("\\s+");
		    for(int i=0;i<n;i++){
		        a[i]=Integer.parseInt( in[i]);
		    }
		    if(solution(a,n))
		    System.out.println("Yes");
		    else
		     System.out.println("No");
	}
}
 static boolean solution(int a[],int n){
     Arrays.sort(a);
     
         for(int i=0;i<n;i++){
             a[i]=(int)Math.pow(a[i],2);
         }
         int z=n-1;
          int f=0;
         int i=0,k=n-2;
         int c=0;
         while( z>0){
             f=a[z];
             
            if(i!=k){
             int sum=a[i]+a[k];
             if(sum<f){
             i++; continue;}
             else if(sum>f){
             k--; continue;}
             else if(sum==f){
             c++;
             break;}}
              else{
                  z--;
                  i=0;
                  k=z-1;
              }
             
         }
         if(c==0)
         return false;
         else 
         return true;
             
         }
}
