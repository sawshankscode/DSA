package InfyTQ;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = new Scanner(System.in).nextLine();
		
		String output="";
		for(String index:input.split("")) {
			
				output=index+output;
		}
		System.out.println(output);

	}

}
