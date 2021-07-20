package Accenture;

public class NexLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='r';
		char ch2='l';
		System.out.println(solution(ch1,ch2));

	}

	private static String solution(char ch1, char ch2) {
		// TODO Auto-generated method stub
		int d1=ch1;
		int d2=ch2;
		int distance=Math.abs(d2-d1);
		if(d1<d2) {
			return String.valueOf(Character.toChars(ch2+distance));
		}
		else
			return String.valueOf(Character.toChars(ch2-distance));
	}

}
