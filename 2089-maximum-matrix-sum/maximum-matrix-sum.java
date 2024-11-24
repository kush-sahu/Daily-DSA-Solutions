// class Solution {
//     public long helper(int matrix[][], int a, int b, long curr){
//       int arr[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//       long sum=0;
//       int length=matrix.length;
//        for(int i=0;i<arr.length;i++){
//            int p=a+arr[i][0];
//            int q=b+arr[i][1];
//           if(p>-1 && p<length && q<length && q>-1){
//            sum=Math.max(sum,curr-matrix[p][q] + (matrix[p][q]*(-1)));
//           }
//        }
//     return sum;


//     }
//     public long maxMatrixSum(int[][] matrix) {
//         int r=matrix.length;
//         int c=matrix[0].length;
//         long dp[][]=new long[r][c];
//         long TotalSum=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//               TotalSum+=matrix[i][j];
//             }
//         }
//         long ans=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                long currentDel=TotalSum-matrix[i][j] + (matrix[i][j]*(-1));
//                long currSum=helper(matrix, i,j,currentDel);
//                if(TotalSum<currSum){
//                 dp[i][j]=currSum;
//                }else{
//                 dp[i][j]=TotalSum;
//                }
//                ans=Math.max(ans,dp[i][j]);
//             }
//         }
//         return ans;

//     }
// }

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int minAbsValue = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int value = matrix[i][j];
                totalSum += Math.abs(value); // Add absolute value to the total sum
                minAbsValue = Math.min(minAbsValue, Math.abs(value)); // Track smallest absolute value
                if (value < 0) {
                    negativeCount++; // Count negatives
                }
            }
        }

        // If odd negatives, subtract twice the smallest absolute value
        if (negativeCount % 2 != 0) {
            totalSum -= 2 * minAbsValue;
        }

        return totalSum;
    }
}
