package Backtracking;

import java.util.ArrayList;

public class PartitionArray { // 			DIVIDE GIVEN ARRAY INTO TWO PARTS HAVING EQUAL SUM

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,2,3,4,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		ArrayList<Integer> ans=new ArrayList<>();
	 boolean isPossible=(sum&1)==0 && partition(a, sum/2, 0, ans);		
	 if(isPossible)
	 {
		 for(int e:ans)
			 System.out.print(e+" ");
	 }
	 else System.out.println("not possible");
	 
	}
	static  boolean partition(int a[],int sum,int i, ArrayList<Integer> ans) {
		if(i>=a.length || sum<0) return false;
		if(sum==0) return true;							//BASE CONDITION
		ans.add(a[i]);
		boolean leftPossible=partition(a, sum-a[i], i+1, ans); //WE ARE CONSIDERING ONLY ONE SUBPART AND INITIALLY WE ADD THE ELEMENT INTO IT
		if(leftPossible) return true;						  // AND THEN CHECK IF LEFT ARRAY CAN BE PARTITIONED USING RECURSION 
		ans.remove(ans.size()-1);			//BACKTRACKING	// IF LEFT ARAY CANNOT BE PARTITION THEN THEN ADDED ELEMENT IS RETURNED USING BACKTRACKING
		return partition(a, sum, i+1, ans);
	}

}
