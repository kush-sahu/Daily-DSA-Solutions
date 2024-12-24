class Solution {
    public int findRows(int mat[][],int mid){
        int index=0;
        int max=0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][mid]>max){
                max=mat[i][mid];
                index=i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int low=0;
        int high=mat[0].length;

        while(low<=high){
            int mid=low+(high-low)/2;
            int row=findRows(mat,mid);
            int left=mid-1>=0 ? mat[row][mid-1]:-1;
            int right=mid+1<mat[0].length ? mat[row][mid+1]:-1;
            if(left< mat[row][mid] && mat[row][mid]>right){
                return new int[]{row,mid};
            }else if(left>mat[row][mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}