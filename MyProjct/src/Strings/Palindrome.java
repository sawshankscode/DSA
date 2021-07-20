package Strings;


	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class Palindrome {
	    static Stack<String> s=new Stack<>();
		public static void main (String[] args) throws IOException{
			//code
			BufferedReader br = new BufferedReader( 
	                new InputStreamReader(System.in));
			int t= Integer.parseInt(br.readLine());
			while(t--!=0) {
				
			    String input = br.readLine();
			    if(input.length()==1)
			   s.push(input);
			   else
			   s.push(input.substring(0,1));
			    for(int i=0;i<input.length();i++){
			        for(int j=input.length()-1;j>i;j--){
			        String ch=input.substring(i,j+1);
			        
			         StringBuilder app=new StringBuilder();
			         app.append(ch);
			         app.reverse();
			        if(ch.equals(app.toString()))
			            if(ch.length()>s.peek().length()){
			                s.pop();
			                s.push(ch);}
			            
			    }
		}
		System.out.println(s.pop());
	}
	}
	}

