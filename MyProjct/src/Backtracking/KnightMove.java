package Backtracking;

public class KnightMove { 			//GHODE KI CHAAAL....
	static int N=8;
	static boolean isSafe(int x,int y,int sol[][]) {
		return x>=0 && x<N &&y>=0 &&y<N &&sol[x][y]==-1;
	}
	static void prinSol(int sol[][]) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
				System.out.print(" "+sol[i][j]);
			System.out.println();
		}
	}
	static boolean solveKT() {
		int sol[][]=new int[8][8];
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				sol[i][j]=-1;
		int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1}; 
        sol[0][0]=0;
        if(!solveKTUtil(0,0,1,sol,xMove,yMove)) {
        	System.out.println("Not Possible");
        return false;}
        else
        	prinSol(sol);
        	return true;
		
	}
	static boolean solveKTUtil(int x,int y ,int movei,int sol[][],int xMove[],int yMove[]) {
		if(movei==N*N) return true;
		int k,next_x,next_y;
		for(k=0;k<N;k++) {
			next_x=x+xMove[k];
			next_y=y+yMove[k];
			if(isSafe(next_x, next_y, sol)) {
				sol[next_x][next_y]=movei;
				if(solveKTUtil(next_x, next_y, movei+1, sol, xMove, yMove))
					return true;
				else
					sol[next_x][next_y]=-1;				//BACKTRACKING
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			solveKT();
	}

}
