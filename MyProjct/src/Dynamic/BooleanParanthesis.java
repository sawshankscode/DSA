package Dynamic;
import java.util.*;
public class BooleanParanthesis {	
	static Map<String,Integer> map=new HashMap<>();// i=0 j=n-1 isTrue given in question
	public static int solve(char[] x,int i,int j,boolean isTrue) {
		if(i>j)
			return 0;
		else if(i==j) {
			if(isTrue==true)
				return(x[i]=='T')?1:0;
			else
				return (x[i]=='F')?1:0;
		}
		String temp=Integer.toString(x[i])+" "+Integer.toString(x[j])+" "+Boolean.toString(isTrue);
		if(map.containsKey(temp))
			return map.get(temp);
		int ans =0;
		for(int k=i+1;k<=j-1;k+=2) {
			int lt=solve(x, i, k, true);
			int lf=solve(x, i, k, false);
			int rt=solve(x, k+1, j, true);
			int rf=solve(x, k+1, j, false);
			
			if(x[i]=='&') {
				if(isTrue==true)
					ans=ans+lt*rt;
				else
					ans+=lt*rf+rt*lf;
			}
			if(x[i]=='|') {
				if(isTrue==true)
					ans=ans+lt*rt+lt*rf+rt*lf;
				else
					ans+=lf*rf;
			}
			if(x[i]=='^') {
				if(isTrue==true)
					ans=ans+lf*rt+lf*rt;
				else
					ans+=lf*rf+rt*lt;
			}
		}
		map.put(temp,ans%1003);
		return ans%1003;
	}

}
