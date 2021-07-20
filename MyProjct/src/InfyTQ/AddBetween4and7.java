package InfyTQ;
import java.util.*;

 class AddBetween4and7 {
	public static int sum(String para) {
		int num1=0;
		int num2=0;
		char start='4';
		char end='7';
		
		for(int index=0;index<para.length();index=index+2) {
			if(para.charAt(index)!= start) 
				num1+=Integer.parseInt(Character.toString(para.charAt(index)));
			else  {
				StringBuilder sb=new StringBuilder();
				while(index<para.length()) {
					sb.append(para.charAt(index));
					index=index+2;
					if(para.charAt(index)==end)
						break;
				}
				sb.append(end);
				num2=Integer.parseInt(sb.toString());
				
			}
		}
		
		return num1+num2;
			
		}
	
	
	public static void main(String[] args) {
//		String para= "3,1,6,4,2,3,7,2";
//		System.out.println(sum(para));
	
		
	}

	

}
