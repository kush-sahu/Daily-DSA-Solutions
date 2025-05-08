class Solution {
    public void copyFunction(char a[][],char b[][],int m , int n){
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=b[i][j];
            }
        }
    }
    public void solve(char[][] board) {
        int m =board.length ,n = board[0].length;
        char copy[][]=new char[m][n];
       copyFunction(copy,board,m,n);


        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(board[i][j]=='O'){
                   if(dfs(i,j,copy)){
                     board[i][j]='X';
                    }else {
                        copyFunction(copy,board,m,n);
                    }
                }              
            }
        }

    }
    public boolean dfs(int i, int j,char copy[][]){
        if(i<0 || i>=copy.length || j<0 || j>=copy[0].length){
             return true;
        }
        if(copy[i][j]=='O' && (i==0 || i==copy.length-1 || j==copy[0].length-1 ||j==0))return false;
        if(copy[i][j]=='X')return true; 
        if(copy[i][j]=='O')copy[i][j]='X';

       return(dfs( i,j+1, copy) && dfs( i,j-1, copy) && dfs( i+1,j, copy) && dfs( i-1,j, copy));
    }
}