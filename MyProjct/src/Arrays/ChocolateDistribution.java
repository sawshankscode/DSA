package Arrays;
import java.util.*;
import java.io.*;
public class ChocolateDistribution {
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
		    	int k= Integer.parseInt(br.readLine());
		    int d=	solution(a,n,k);
		    System.out.println(d);
	}
}
    static int solution(int a[],int n,int k){
    Arrays.sort(a);
    int i=1;
    int min=a[k-1]-a[0];
 
    while(i+k<=n){
        if((a[i+k-1]-a[i])<min)
            min=a[i+k-1]-a[i];
        i++;
    }
    return min;
}
}
