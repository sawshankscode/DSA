package Strings;

public class MinOps {

	 static int sol(char[] s1, char[] s2)
	  {
	 
	    // Stores the minimum count of
	    // reversal of substrings required
	    int ans = 0;
	 
	    int N = s1.length;
	 int i=0;
	    // Iterate over each character
	    while(i<N-1) {
	    	if(s1[i]==s2[i] && s1[i+1]==s2[i+1]) {
	    		i+=2;
	    		continue;
	    	}
	    
	    	if(s1[i]=='1')
	    		s1[i]='0';
	    	else
	    		s1[i]='1';
	    	if(s1[i+1]=='1')
	    		s1[i+1]='0';
	    	else
	    		s1[i+1]='1';
	    	ans++;
	    	i++;
	    	
	    		
	    }
	    //System.out.println(s1);
	    int flag=0;
	    for(int j=0;j<N;j++)
	    	if(s1[j]!=s2[j])
	    		flag=1;
	    if(flag==0)
	    	return ans;
	   return -1;
	  }
	 
	  // Driver Code
	  public static void main(String[] args)
	  {
	    String S1 = "111";
	    String S2 = "011";
	    int ans=sol(S1.toCharArray(), S2.toCharArray());
	    // Function Call
	    System.out.println(ans);
	  }
	}


