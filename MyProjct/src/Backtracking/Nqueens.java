package Backtracking;

public class Nqueens {
		static boolean solveUtil(int board[][],int n,int col)
		{
			if(col>=n)
				return true;
			for(int i=0;i<n;i++) {
				if(!isSafe(i,col,board,n)) {
					
				board[i][col]=1;
				if(solveUtil(board,n,col+1))
					return true;
				board[i][col]=0;
			}
				return false;
		}
		}
	static boolean isSafe(int i,int col,int board[][],int n) {
		for(int x=i)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
