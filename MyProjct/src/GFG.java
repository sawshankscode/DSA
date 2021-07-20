import java.util.Scanner;

class GFG 
{
    public static void main (String[] args) 
	{
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int i=0,s=0;
    	while(n>0) {
    		int r=n%10;
    		int p=(int) Math.pow(8, i);
    		s=s+p*r;
    		i++;
    		n=n/10;
    		
    	}
    	System.out.println(s);
}
}