package Recursion;
import java.util.*;

public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=40;
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(i+1);
		}
		int k=7;
		int ans=0;
		System.out.println(circleDeath(arr,k-1,0,ans));

	}
	
	private static int circleDeath(ArrayList<Integer> arr, int k,int index,int ans) {
		// TODO Auto-generated method stub
		if(arr.size()==1)
			return arr.get(0);
		index=(index+k)%arr.size();
		arr.remove(index);	
		
		
		
		return circleDeath(arr, k, index, ans);
	}

}
