package Strings;

public class ExcelSheetPart1 {
	 public String excelColumn(int n) {
	        
	        //  Your code 
	        n=n-1;
	        String ans="";
	        ans+=(char)('A'+n%26);
	        n=n/26;
	        while(n>0){
	        ans=(char)('A'+(n-1)%26)+ans;
	        n=(n-1)/26;
	        }
	        return ans;
	        
	        
	        
	    }
}
