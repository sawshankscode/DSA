import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int ans=0;
			for(int i=1;i<=n-1;i++) {
				 if(n-2*i<=0)
					 break;
					ans+=n-2*i;
				
			}
			System.out.println(ans);		
		}

	}

}
