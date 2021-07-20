package Accenture;

public class NthPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=2;i<100;i++) {
			boolean notprime=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					notprime=true;
					break;
					}
				}
			if(notprime==false ) {
				n--;
				if(n==0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
