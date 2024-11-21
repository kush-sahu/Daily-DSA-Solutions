class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int dp[][]=new int[m][n];
        
        for(int i=0;i<walls.length;i++){
            dp[walls[i][0]][walls[i][1]]=-1;
        }
        for(int i=0;i<guards.length;i++){
            dp[guards[i][0]][guards[i][1]]=-2;
        }

        for(int p=0;p<guards.length;p++){
            int i=guards[p][0];
            int j=guards[p][1];

            if(i<m ){
                for(int a=i+1;a<m;a++){
                    if(dp[a][j]==0){
                      dp[a][j]=1;
                    }else if(dp[a][j]==-1 || dp[a][j]==-2){
                       
                        break;
                    }
                }
            }
            if(j<n){
                for(int b=j+1;b<n;b++){
                    if(dp[i][b]==0){
                    
                        dp[i][b]=1;
                    }else if(dp[i][b]==-1 || dp[i][b]==-2){
                    
                        
                        break;
                    }
                }
            }

            if(i>0){
                for(int b=i-1;b>=0;b--){
                    if(dp[b][j]==0){
                      
                        dp[b][j]=1;
                    }else if(dp[b][j]==-1 || dp[b][j]==-2){
                        
                        break;
                    }
                }
            }
            if(j>0){
                for(int b=j-1;b>=0;b--){
                    if(dp[i][b]==0){
                        dp[i][b]=1;
                    }else if(dp[i][b]==-1 || dp[i][b]==-2){
                       
                        break;
                    }
                }
            }
        }
        int c=0;
         for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            if(dp[i][j]==0)c++;
           }
        }
        return c;

    }
}