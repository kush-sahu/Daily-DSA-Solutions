class Solution {
    public int minimumArea(int[][] grid) {
        int mrow=Integer.MAX_VALUE;
        int mcol=Integer.MAX_VALUE;
        int maxrow=Integer.MIN_VALUE;
        int maxcol=Integer.MIN_VALUE;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                mrow=Integer.min(i,mrow);
                mcol=Integer.min(j,mcol);
                maxrow=Integer.max(i,maxrow);
                maxcol=Integer.max(j,maxcol);
                }
            }
        }
        mrow=maxrow-mrow+1;
        mcol=maxcol-mcol+1;
        return mcol*mrow;
    }
}