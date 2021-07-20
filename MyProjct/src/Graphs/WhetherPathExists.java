package Graphs;

public class WhetherPathExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{1,0,3,0,0},{3,0,0,0,3}
		,{3,3,3,3,3},{0,2,3,0,0},{3,0,0,1,3}};
		
		System.out.println(isPossible(grid));
	}
	
	public static boolean isPossible(int [][] grid) {
		
		int n=grid[0].length;
		  boolean[][] v=new boolean[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(grid[i][j]==1) 
        			return  dfs(grid,i,j,n,v);
        	}
        }
        return false;
	}
       
      
       
		private  static boolean dfs(int[][] grid, int x, int y, int n, boolean[][] v) {
		// TODO Auto-generated method stub
			if(!isSafe(x,y,grid,n,v)) return false;
			
			if(grid[x][y]==2)
				return true;
			v[x][y]=true;
		 return (( dfs(grid,x+1,y,n,v))||
			        (dfs(grid,x,y+1,n,v))||
			        (dfs(grid,x-1,y,n,v))||
			        (dfs(grid,x,y-1,n,v)));
		
	}
		 public  static boolean isSafe(int x,int y,int[][] grid,int n,boolean[][] v){
		        if(x>n-1 || y>n-1||x<0||y<0 || grid[x][y]==0||v[x][y]) return false;
		        return true;
		    }
}
