package Backtracking;

import java.util.ArrayList;

public class MobileKeypad {
	static final String codes[]={ " ", "abc", "def", 
            "ghi", "jkl", "mno", 
            "pqr", "stu", "vwx", 
            "yz" }; 
	static ArrayList<String> printKeyword(String str){
		if (str.length() == 0) { 
            ArrayList<String> baseRes = new ArrayList<>(); 
            baseRes.add(""); 
            return baseRes; 
        } 
		 char ch = str.charAt(0); 
		 String restStr = str.substring(1); 
		  
	        ArrayList<String> prevRes = printKeyword(restStr); 
	        ArrayList<String> Res = new ArrayList<>(); 
	  
	        String code = codes[ch - '0']; 
	  
	        for (String val : prevRes) { 
	  
	            for (int i = 0; i < code.length(); i++) { 
	                Res.add(code.charAt(i) + val); 
	            } 
	        } 
	        return Res; 
	    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str= "23";
			System.out.println(printKeyword(str));
	}

}
