package InfyTQ;

import java.util.ArrayList;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =  new Scanner(System.in).nextLine();
		System.out.println(checkPalindromeSum(input));
		
	}

	private static String checkPalindromeSum(String input) {
		// TODO Auto-generated method stub
		if(input==null || input.length()==0)
			return input;
		String sum= RevSum(input);
		if(isPalindrome(sum))
			return sum;
		return checkPalindromeSum(sum);
	}

	private static String RevSum(String input) {
		
		if(input.length()==1)
			return Integer.toString(Integer.parseInt(input)+Integer.parseInt(input));
		
		String sum="";
		for(String s:input.split(""))
			sum=s+sum;
		return Integer.toString(Integer.parseInt(sum)+Integer.parseInt(input));
	}

	private static boolean isPalindrome(String sum) {
		if(sum.length()==1)
			return true;
		int i=0,j=sum.length()-1;
		while(i<=j) {
			if(sum.charAt(i)!=sum.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
