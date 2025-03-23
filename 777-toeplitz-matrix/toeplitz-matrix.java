class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i+1<n && j+1<m){
                    if(matrix[i][j]!=matrix[i+1][j+1])return false;
                }
            }
        }
        return true;
    }
}