import java.util.ArrayList;
import java.util.HashSet;

public class gasStationExpedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res= "1111122222";
		int arr[]= {1,1,1,2,1,3,4};
		
		int a[]= {1,3,5};
		int b[]= {5,3,1};
		System.out.println(swappingArray(a,b));
	}
	public static String solution(String s, int k) {
		ArrayList<String> temp = new ArrayList<>();
		while(s.length()>k) {
			
			for(int i=0;i<s.length();i+=k) {
				if(i+k<s.length())
					temp.add(s.substring(i, i+k));
				else
					temp.add(s.substring(i));
					
			}
			StringBuilder sb=new StringBuilder();
			for(String i:temp) {
				int digit=0;
				char array[]=i.toCharArray();
				for(char c:array) {
					digit+=Integer.parseInt(String.valueOf(c));
				
				}
				sb.append(digit);
			}
			s=sb.toString();
			temp.clear();
		}
		
		return s;
		
	}
	
	public static int matrix(int arr[]) {
		HashSet<Integer> set=new HashSet<>();
		int n=arr.length;
		int cnt=0;
		for(int i=1;i<n-1;i++) {
			set.add(arr[i-1]);
			set.add(arr[i]);
			set.add(arr[i+1]);
			if(set.size()==2)
				cnt++;
			set.clear();
			
		}
		
		return cnt;
		
	}
	public static int swappingArray(int a[],int b[]) {
		
			int diff=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
				int temp=a[i];
				a[i]=a[j];
				int diff2=0;
				for(int k=0;k<a.length;k++)
					diff2+=Math.abs(a[k]-b[k]);
				diff=Math.min(diff2,diff);
				a[i]=temp;
				}
				else {
					int diff2=0;
				for(int k=0;k<a.length;k++)
					diff2+=Math.abs(a[k]-b[k]);
				diff=Math.min(diff2,diff);
				}
				
				
			}
		}
		return diff;
		
	}
	
	public static int difference(int a[],int b[]) {
		int diff=0;
		for(int i=0;i<a.length;i++)
			diff+=Math.abs(a[i]-b[i]);
		return diff;
	}

}
