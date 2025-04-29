public class Pair{
    int r;
    int c;
    int t;
    public Pair(int r,int c, int t){
        this.r=r;
        this.c=c;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
            }
        }
        int ans=0;
        while(q.size()>0){
            Pair p=q.poll();
            ans=Math.max(ans,p.t);
            int r=p.r;
            int c=p.c;
            int t=p.t;

            if(c<n-1 && grid[r][c+1]==1){
                q.offer(new Pair(r,c+1,t+1));
                grid[r][c+1]=2;
            }
            if(r<m-1 && grid[r+1][c]==1){
                q.offer(new Pair(r+1,c,t+1));
                grid[r+1][c]=2;
            }
            if(c>0 && grid[r][c-1]==1){
                q.offer(new Pair(r,c-1,t+1));
                 grid[r][c-1]=2;
            }
            if( r>0 && grid[r-1][c]==1){
                q.offer(new Pair(r-1,c,t+1));
                grid[r-1][c]=2;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
    }
}