class Solution {
    public int helper(int amount,int coins[],int i, int dp[][]){
  
    if(amount==0){
        return 1;
    }
    
    if(i>=coins.length || amount<0){
        return 0;
    }
    if(dp[i][amount]!=-1)return dp[i][amount];
    int x=helper(amount-coins[i],coins,i,dp);
    int y=helper(amount,coins,i+1,dp);
    dp[i][amount]=x+y;
    return x+y;

    }
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helper(amount,coins,0,dp); 
    }
}