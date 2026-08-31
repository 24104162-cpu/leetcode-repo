// Last updated: 8/31/2026, 9:56:31 AM
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int r=grid.length;
        int c=grid[0].length;
        int[]dp=new int[c];
        int mc=0;
        for(int j=0;j<c;j++){
            dp[j]=1;
            for(int k=0;k<j;k++){
                if(isc(grid,k,j,limit,r)){
                    dp[j]=Math.max(dp[j],1+dp[k]);
                }
            }
            mc=Math.max(mc,dp[j]);
        }
        return mc;
    }
    private boolean isc(int[][] grid,int col1,int col2,int l,int r){
        for(int i=0;i<r;i++){
            if(Math.abs(grid[i][col2]-grid[i][col1])>l){
                return false;
            }
        }
        return true;
    }
    
}