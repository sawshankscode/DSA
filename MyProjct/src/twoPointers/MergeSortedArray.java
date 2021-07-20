package twoPointers;

import java.util.ArrayList;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(8);
		b.add(6);
		b.add(9);
		merge(a,b,a.size(),b.size());
		for(int i:a)
			System.out.print(i+" ");
		

	}

	private static void merge(ArrayList<Integer> a, ArrayList<Integer> b, int n, int m) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		while(j<m) {
			int l=i>=a.size()?Integer.MAX_VALUE:a.get(i);
			int r=b.get(j);
			if(l<=r)
				i++;
			else {
				a.add(i,r);
				i++;
				j++;
			}
		}
		
	}
	
	

}
