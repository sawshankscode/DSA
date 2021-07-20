package InfyTQ;
import java.util.*;
public class TeamDIvision {

	static ArrayList<Integer> array =  new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = new Scanner(System.in).nextLine();
		int n=input.length();
		for(String index:input.split(","))
			array.add(Integer.parseInt(index));
		
		int ss=0;
		for(int index:array)
			ss+=index;
		int su=ss/2;
		int n1=array.size();
		int n2=n1/2;
		int k= ans(n1-1,n2,su);
		System.out.println( (ss-su-k) + " "+ (su+k));
		
		
	}
	private static int ans(int i, int n, int s) {
		// TODO Auto-generated method stub
		if(i<n-1)
			return Integer.MAX_VALUE;
		if(n==0)
			return  Math.abs(s);
		return Math.min(ans(i-1,n-1,s-array.get((i-1)%n)), ans(i-1,n,s));
		
	}

}
