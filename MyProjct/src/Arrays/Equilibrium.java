package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Equilibrium {

															//POINT JISKE LEFT KA SUM=RIGHT KA SUM
		// TODO Auto-generated method stub
		public static void main (String[] args) throws IOException {
			//code
			BufferedReader br = new BufferedReader( 
	                              new InputStreamReader(System.in)); 
			int t= Integer.parseInt(br.readLine());
			while(t--!=0){
			    int n=Integer.parseInt(br.readLine());
			    int a[]=new int[n];
			    String[] in = br.readLine().trim().split("\\s+");
			    for(int i=0;i<n;i++){
			        a[i]=Integer.parseInt( in[i]);
			    }
			   
			    
			    int h=solution(a,n);
			    System.out.println(h);
			    
		}
		
	}
	    static int solution(int a[],int n){
	        int sum1=0;
			    
			    for(int i:a)
			    sum1+=i;
			    int sum2=0;
			    for(int i=0;i<n;i++){
			        sum1=sum1-a[i];
			        if(sum1==sum2){
			          
			            return i+1;
			               
			    }
			    sum2=sum2+a[i];
	    }
	    return -1;
	}

}
