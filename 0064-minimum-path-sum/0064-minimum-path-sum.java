class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        // int [][]dp=new int[n][m];
        // dp[0][0]=grid[0][0];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++){
            if(i==0 && j==0)continue;
            else if(i==0)grid[i][j]=grid[i][j-1]+grid[i][j];
            else if(j==0)grid[i][j]=grid[i-1][j]+grid[i][j];
            else grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
        }
        return grid[n-1][m-1];
    }
}