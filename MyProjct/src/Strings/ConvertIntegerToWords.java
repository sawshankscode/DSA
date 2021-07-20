package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.Reader;


public class ConvertIntegerToWords {
	
  public static void main(String[] args) throws IOException {
	  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	  String s=br.readLine();
	  
	  int ans=0;
	  for(int i=0;i<s.length();i++) {
		  StringBuilder sb =new StringBuilder();
		  if(Character.isDigit(s.charAt(i))){
		  while(i<s.length() && Character.isDigit(s.charAt(i)) ) {
			  sb.append(s.charAt(i));
			  i++;
			  }
		  ans+=Integer.parseInt(sb.toString());
		 
		  }
	  }
	
	  System.out.println(s);

}
}
