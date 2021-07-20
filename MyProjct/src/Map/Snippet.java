package Map;

public class Snippet {
	int maxLen(int a[], int n)
	    {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        int sum=0;
	        int maxlength=0;
	        for(int i=0;i<n;i++)
	        {
	            sum=sum+a[i];
	            if(!map.containsKey(sum)&& sum!=0)
	            {
	                map.put(sum,i);
	            }
	            else
	            {
	                if(sum==0)
	                    maxlength=i+1;
	                else
	                    maxlength=Math.max(maxlength,i-map.get(sum));
	            }
	        }
	        return maxlength;
	  
	    }
}

