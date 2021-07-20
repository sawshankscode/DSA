package Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class MinSwapsSorted {
//	public static void main(String[] args) throws IOException  {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine().trim());
//        while(T-->0)
//        {
//            int n = Integer.parseInt(br.readLine().trim());
//            int[] nums = new int[n];
//            String[] S = br.readLine().trim().split(" ");
//            for(int i = 0; i < n; i++){
//                nums[i] = Integer.parseInt(S[i]);
//            }
//            
//            System.out.println(minSwaps(nums,n));
//	}
//	}
	static public int minSwaps(int []arr,int n) {
		int sec[]=new int[n];
		System.arraycopy(arr, 0, sec, 0, n);
		Arrays.sort(sec);
	//	System.out.println(Arrays.toString(sec));
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
			map.put(sec[i],i);
		for(int i=0;i<n;i++)
			arr[i]=map.get(arr[i]); 			//ARR[I] CONTAINS LOCATION WHERE VALUE OF ORIGINAL ARR[I] SHOULD BE PRESENT AFTER SORTING
		System.out.println(Arrays.toString(arr));
		boolean vis[]=new boolean[n];
		int x=0;
		int ans=0;
		while(x<n) {
			int s=x;
			if(vis[s]==false) {
				
				vis[s]=true;
				int c=0;
				while(vis[arr[s]]==false) {
					c+=1;
					 s=arr[s];
					vis[s]=true;
					
			}
				ans+=c;
		}
			x++;
	}
		return ans;
}
	public static void main(String[] args) {
		int arr[]= {7 ,16 ,14, 17 ,6 ,9 ,5 ,3, 18};
		int n=9;
		System.out.println(minSwaps(arr, n));
	}
}
