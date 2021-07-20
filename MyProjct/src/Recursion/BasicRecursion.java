package Recursion;

public class BasicRecursion {
	static int stepCount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			System.out.println(sum(15));	
//			System.out.println(pow(3,1000));
//			System.out.println(stepCount);
//			stepCount=0;
//			System.out.println(fastPow(3,1000));
//			System.out.println(stepCount);
		System.out.println(matrix(400,1));
	}
	static int sum(int n) {				//FIND SUM OF FIRST N NATURAL NUMBERS
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	static int fastPow(int a, int b) {	//FIND a^b(fast method)
		stepCount++;
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return (fastPow(a*a,b/2));
		}
		
			return a*fastPow(a,b-1);
		
	}
	static int pow(int a, int b) {	//FIND a^b(standard method)
		stepCount++;
		if(b==0) {
			return 1;
		}
		return a*pow(a,b-1);
	}
	static int matrix( int m,int n) {	//FIND NO. OF PATHS FOR REACHING FROM START TO END OF A MATRIX
		if(m==1 || n==1) {
			return 1;
		}
		return matrix(m,n-1)+matrix(m-1,n);
		
	}
	

}
