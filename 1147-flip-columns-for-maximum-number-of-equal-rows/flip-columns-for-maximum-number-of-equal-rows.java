class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<m;i++){
            StringBuilder noIn= new StringBuilder();
            // StringBuilder In=new StringBuilder();
            for(int j=0;j<n;j++){
                noIn.append(matrix[i][j]);
                // In.append(matrix[i][j]==1 ? 0 : 1);
            }
            hm.put(noIn.toString(),hm.getOrDefault(noIn.toString(),0)+1);
            // hm.put(In.toString(),hm.getOrDefault(In.toString(),0)+1);
        }
      int ans=0;
        for(int i=0;i<m;i++){
            StringBuilder noIn= new StringBuilder();
            StringBuilder In=new StringBuilder();
            for(int j=0;j<n;j++){
                noIn.append(matrix[i][j]);
                In.append(matrix[i][j]==1 ? 0 : 1);
            }
        ans=Math.max(hm.getOrDefault(noIn.toString(),0)+hm.getOrDefault(In.toString(),0),ans);
        }
     return ans;
    }
}