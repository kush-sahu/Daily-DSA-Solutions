class Solution {
    public int helper(int i, int j,int board[][],int n, int m){
     int arr[][] = {  {-1, -1}, {-1,  0}, {-1,  1}, { 0, -1},{ 0,  1},{ 1, -1}, { 1,  0},{ 1,  1}};

        int count=0;
        for(int a=0;a<arr.length;a++){
            int ind1=i+arr[a][0];
            int ind2=j+arr[a][1];
            
            if((ind1>-1 && ind1<n) && (ind2>-1 && ind2<m)){
                if(board[ind1][ind2]==1)count++;
            }
        }
        return count;
    }
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int c=helper(i,j,board,n,m);
                if(board[i][j]==0){
                    
                    if(c==3){
                        mat[i][j]=1;
                    }
                }else{
                    if(c<2 ){
                        mat[i][j]=0;
                    }else if(c==2 || c==3){
                        mat[i][j]=1;
                    }else if(c>3) mat[i][j]=0;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=mat[i][j];
            }
        }


    }
}