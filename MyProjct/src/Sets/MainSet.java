package Sets;
import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		
		Set<Integer> x=new HashSet<>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		
		Set<Integer> y=new HashSet<>();
		y.add(2);
		y.add(3);
		y.add(4);
		x.retainAll(y);
		System.out.println(x);

}
}