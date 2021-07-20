package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctCount {
	ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int j = 0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            if(i+1>=k){
                list.add(map.size());
                if(map.containsKey(A[j]) && map.get(A[j])<=1)
                    map.remove(A[j]);
                else if(map.containsKey(A[j]) && map.get(A[j])>1) map.put(A[j],map.get(A[j])-1);
                j++;
            }
            
        }
        return list;
    }
}
