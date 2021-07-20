package Backtracking;

class Sudoku
{
    static boolean SolveSudoku(int grid[][])
    {
        boolean flag=false;
        int i=0,j=0;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(grid[i][j]==0){
                    flag=true;
                    break;
                }
            }
            if(flag)
            break;
        }

        if(i==9&&j==9)
            return true;
        for(int n=1;n<=9;n++){
            if(isSafe(grid,i,j,n)){
                grid[i][j]=n;
                if(SolveSudoku(grid))
                    return true;
                    grid[i][j]=0;
            }
        }
        return false;
    }
    static boolean isSafe(int[][] grid,int i,int j,int n){
        for(int k=0;k<9;k++)
            if(grid[i][k]==n||grid[k][j]==n)
                return false;
        int rs=i-i%3;
        int cs=j-j%3;
        for(int r=0;r<3;r++)
            for(int c=0;c<3;c++)
                if(grid[rs+r][cs+c]==n)
                    return false;
        return true;
    }

    static void printGrid(int[][] grid){
        StringBuffer br= new StringBuffer();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
                br.append(grid[i][j]+" ");
        }
        System.out.print(br.toString().trim());
    }
}
