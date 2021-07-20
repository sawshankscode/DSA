package Sets;
import java.util.HashSet;
import java.util.Set;

public class ZeroSubArraySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,5,4,7,11,-27};
		boolean found=false;
		int k=8;
		Set<Integer> s=new HashSet<>();
		int sum=0;
		for(int i:a) {
			s.add(sum);
			sum+=i;
		
			if(s.contains(sum-k)) {
				found=true;
				break;
			}
		}
			
		System.out.println(found);
	}

}
