package Strings;


	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class GFG {
		public static void main (String[] args) throws IOException {
			//code
			BufferedReader br = new BufferedReader( 
		                new InputStreamReader(System.in));
				int t= Integer.parseInt(br.readLine());
				while(t--!=0) {
					
				    String s1 = br.readLine();
				    String s2=br.readLine();
				    
				    if(leftRotate(s1,2).equals(s2))
				        System.out.println(1);
				        else if(rightRotate(s1,2).equals(s2))
				            
				             System.out.println(1);
				              else
				        System.out.println(0);
				        }
				        
				         
				}
		
		static String leftRotate(String s1, int d){
		    String ans= s1.substring(d)+s1.substring(0,d);
		    return ans;
		}
		static String rightRotate(String s1, int d){
		    return leftRotate(s1,s1.length()-d);
		}
	}

