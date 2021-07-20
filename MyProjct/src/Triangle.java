import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			int x3=sc.nextInt();
			int y3=sc.nextInt();
			long d1= (long) (Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
			long d2=(long) (Math.pow((x1-x3), 2)+Math.pow((y1-y3), 2));
			long d3=(long) (Math.pow((x2-x3), 2)+Math.pow((y3-y2), 2));
			if(d1==d2 && d2==d3 && d3==d1)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}

}
