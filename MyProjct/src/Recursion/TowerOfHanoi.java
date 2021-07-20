package Recursion;

public class TowerOfHanoi {
static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toh(1,1,3,2));
	}
	 public static long toh(int n, int from, int to, int aux) {
		 if(n==1) {
			 System.out.println("Move disc "+n+" from "+from+" to "+to);
			 return ++cnt;
		 }
		 toh(n-1,from,aux,to);
		 System.out.println("Move disc "+n+" from "+from+" to "+to);
		
		 toh(n-1,aux,to,from);
		 return ++cnt;
	 }
}
