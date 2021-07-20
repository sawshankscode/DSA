package InfyTQ;
import java.util.*;

public class MinimumDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,1,1,2,2,3,3,4,5,6};
		int x=4,z=10;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:a)
			map.merge(i,1,Integer::sum);
		System.out.println(map);
		ArrayList<Integer> al=new ArrayList<>();
		for(Map.Entry<Integer, Integer> e:map.entrySet()) {
			al.add(e.getKey()+z*(e.getValue()));
		}
		Collections.sort(al);
		System.out.println(al);
		for(int i=0;i<x;i++) {
			int n1=al.get(i)%z;
			int n2=al.get(i)/z-1;
			if(n2==0) {
				al.remove(i);
				i--;
			}
			else
				al.add(i,n1+(n2)*z);
		}
		for(int i:al)
			System.out.println(i%z+" "+i/z);

	}

}
