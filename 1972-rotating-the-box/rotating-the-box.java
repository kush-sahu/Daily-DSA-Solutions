class Solution {
    public void helper(char dp[][],int a, int b, int stone){
        while(a>=0 && stone>0){
            dp[a][b]='#';
            stone--;
            a--;
        }
    }
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length;
        int n=box[0].length;
        char dp[][]=new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = '.';
            }
        }
        for(int i=0;i<m;i++){
            int stone=0;
            for(int j=0;j<n;j++){
               if(box[i][j]=='#'){
                stone++;
               }else if(box[i][j]=='*'){
                int a=j;
                int b=m-1-i;
                dp[a][b]='*';
                helper(dp,a-1,b,stone);
                stone=0;
               }
            

            
            }
            if(stone >0){
                int a=n-1;
                int b=m-1-i;
                  helper(dp,a,b,stone);
            }
        }
        return dp;
    }
}

