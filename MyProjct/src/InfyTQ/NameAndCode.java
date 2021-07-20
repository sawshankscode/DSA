package InfyTQ;

import java.util.Scanner;

public class NameAndCode {
	static String ans="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=new Scanner(System.in).nextLine();
		System.out.println(code(input));
		
	}

	private static String code(String input) {
		
		String[] temp=input.split("[:,+]");
	
		for(int index=0;index<temp.length-1;index=index+2) {
			compare(temp[index],temp[index+1]);
		}
		
		return ans;
	}

	private static void compare(String name, String code) {
		int n=name.length();
		int max=-1;
		for(char c:code.toCharArray()) {
			if(Integer.parseInt(String.valueOf(c))<=n)
				max=Math.max(Integer.parseInt(String.valueOf(c)), max);
		}
		if(max==-1)
			ans+="X";
		else
			ans+=(name.charAt(max-1));
		
		
		
	}

}
