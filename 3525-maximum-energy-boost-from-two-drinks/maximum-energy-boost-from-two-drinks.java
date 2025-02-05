class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n=energyDrinkA.length;
        long dp[][]=new long[2][n];

        dp[0][0]=energyDrinkA[0];
        dp[1][0]=energyDrinkB[0];


        for(int i=1;i<n;i++){
            dp[0][i]=energyDrinkA[i]+Math.max(dp[0][i-1],i-2>=0 ? dp[1][i-2] :0);
            dp[1][i]=energyDrinkB[i]+Math.max(dp[1][i-1],i-2>=0 ? dp[0][i-2] :0);
        }
        return Math.max(dp[1][n-1],dp[0][n-1]);
    }
}