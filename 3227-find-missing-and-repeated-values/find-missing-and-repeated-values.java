class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[grid.length*grid.length];
        int result[]=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[grid[i][j]-1]=ans[grid[i][j]-1]+1;
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==2)result[0]=i+1;
            if(ans[i]==0)result[1]=i+1;
        }
        return result;
    }
}