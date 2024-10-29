class Solution {
    public int maxMoves(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int ele[]:dp){
            Arrays.fill(ele,0);
        }
        int ans=0;
        
         for(int i=0;i<grid.length;i++){
            ans=Math.max(ans,getmax(grid,i,0,dp));
         }
          
        return ans;
    }
    public int getmax(int grid[][],int i, int j, int dp[][]){
        if(j>=grid[0].length || i<0 || i>=grid.length)return 0;
        if(dp[i][j]!=0)return dp[i][j];

        int max=0;
        if((i>0 && j+1<grid[0].length)&& grid[i][j]<grid[i-1][j+1]){
            max=Math.max(max,1+getmax(grid,i-1,j+1,dp));
        }
        if( j+1<grid[0].length && (grid[i][j]<grid[i][j+1])){
            max=Math.max(max,1+getmax(grid,i,j+1,dp));
        }
        if((i+1<grid.length && j+1<grid[0].length) && grid[i][j]<grid[i+1][j+1]){
            max=Math.max(max,1+getmax(grid,i+1,j+1,dp));
        }
        dp[i][j]=max;
        return max;
    }
}