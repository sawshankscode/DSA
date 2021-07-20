package Strings;

public class KPMAlgo {

	 public static void main(String args[]) 
	    { 
	        String txt = "ABABDABACDABABCABAB"; 
	        String pat = "ABABCABAB"; 
	        kpmAlgo(pat, txt); 
	    } 
	public static void kpmAlgo(String pat,String txt) {
		int N=txt.length();
		int M=pat.length();
		int lps[]=new int[M];
		computeLPSArray(pat,M,lps);
		int i=0,j=0;
		while(i<N) {
			if(pat.charAt(j)==txt.charAt(i)) {
				i++;
				j++;
			}
			if(j==M) {
				System.out.println("pattern found at location");
				j=lps[j-1];
			}
			else if(i<N && pat.charAt(j)!=txt.charAt(i)) {
				if(j!=0)
					j=lps[j-1];
				else
					i++;
			}
		}
}
	public static void computeLPSArray(String pat,int M,int[]lps) {
		int len=0;
		lps[0]=0;
		int i=1;
		while(i<M) {
			if(pat.charAt(i)==pat.charAt(len)){
				len++;
				lps[i]=len;
				i++;}
			else {
				if(len!=0) {
					len=lps[len-1];
				}
				else {
					lps[i]=len;
					i++;}
				}
				
			}
		}
		
	}
