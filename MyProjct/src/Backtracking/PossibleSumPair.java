package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PossibleSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			Arrays.sort(a);
			int sum=sc.nextInt();
			List<List<Integer>> finalResult=new ArrayList<>();
			List<Integer> pro=new ArrayList<>();
			finalResult=pair(a,sum);
			if(finalResult.isEmpty())
				System.out.println("Empty");
				else
				for(int i=0;i<finalResult.size();i++)
					{pro=finalResult.get(i);
					System.out.print("(");
					for(int j=0;j<pro.size();j++)
				System.out.print(pro.get(j));
					System.out.print(")");}
		}
	}
	
	static List<List<Integer>> pair(int a[],int sum) {
		List<List<Integer>> results=new ArrayList<>();
		if(a==null || a.length==0)
			return results;
		List<Integer> combinations=new ArrayList<>();
		finalPair(a,sum,results,combinations,0);
			
			return results;
				
		}
	static void finalPair(int a[],int sum,List<List<Integer>> results,List<Integer> combinations,int startIndex){
		if(sum==0) {
			 results.add(new ArrayList<>(combinations));
			 return;}
			for(int i=startIndex;i<a.length;i++) {
				if(i!=startIndex && a[i]==a[i-1])
					continue;
				if(a[i]>sum)
					break;
				combinations.add(a[i]);
				finalPair(a, sum-a[i], results, combinations, i+1);
				combinations.remove(combinations.size()-1);
			}
	}
	}


