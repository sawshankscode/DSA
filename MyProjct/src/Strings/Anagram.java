package Strings;





import java.util.*;
import java.lang.*;
import java.io.*;

public class Anagram {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader( 
                new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t--!=0) {
			
		    String[] in = br.readLine().trim().split("\\s+");
		    String s1=(String)in[0];
		    String s2=(String)in[1];
		    int c=solution(s1,s2);
		    if(c==0)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}
	}
	static int solution(String s1,String s2){
		if(s1.length()!=s2.length())
			return 0;
		    char ch1[]=s1.toCharArray();
		    char ch2[]=s2.toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		  
		    if(Arrays.equals(ch1, ch2))
		     return 1;
		     else
		     return 0;
	}
}

