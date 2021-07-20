package Map;

public class NumberOfSubArrays {
	static int countSubarrWithEqualZeroAndOne(int arr[], int N)
    {
        // add your code here
        for(int i=0;i<N;i++)
            if(arr[i]==0)
                arr[i]=-1;
        int sum=0,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(sum==0)
                count++;
             if(map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
        }
            else
            map.put(sum,1);
    }
    return count;
}
}
