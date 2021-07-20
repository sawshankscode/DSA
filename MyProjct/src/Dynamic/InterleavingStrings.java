package Dynamic;

public class InterleavingStrings {
	public boolean isInterLeave(String a,String b,String c)
	{
        boolean dp[][]=new boolean[a.length()+1][b.length()+1];
        return solve(a,b,c,0,0,0,dp);
        
    }
    public static boolean solve(String a,String b,String c,int i,int j,int k,boolean dp[][]){
        if(a.length()==i && b.length()==j&& c.length()==k)
            return true;
        
        if(c.length()==k)
            return false;
        
        if(dp[i][j]==true)
            return dp[i][j];
            
        boolean p=false;
        if(i<a.length()){
        if(a.charAt(i)==c.charAt(k))
            p=solve(a,b,c,i+1,j,k+1,dp);}
            
        boolean q=false;
        if(p==false){
            if(j<b.length()){
        if(b.charAt(j)==c.charAt(k))
            q=solve(a,b,c,i,j+1,k+1,dp);
            }
        }
        return dp[i][j]=p||q;
    }
}
