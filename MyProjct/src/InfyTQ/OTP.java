package InfyTQ;

import java.util.Scanner;

public class OTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=new Scanner(System.in).nextLine();
		System.out.println(otp(input));

	}

	private static String otp(String input) {
		
		StringBuilder sb=new StringBuilder();
		
		for(int index=1;index<input.length();index=index+2) {
			int temp=Integer.parseInt(Character.toString(input.charAt(index)));
			temp=temp*temp;
			sb.append(temp);
			if(sb.toString().length()==4)
				break;
		}
		return sb.toString();
		}

}
