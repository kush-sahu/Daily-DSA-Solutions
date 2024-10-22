class Solution {
    public int helper(int dp[][],int coins[],int amount, int i, int c){
       if(amount==0){
         return 0;
       }
       if(i>=coins.length || amount<0){
           return Integer.MAX_VALUE-1;
       }
       
       if(dp[i][amount]!=-1)return dp[i][amount];
       
        int x= helper(dp,coins,amount-coins[i],i,c+1);
         if (x != Integer.MAX_VALUE - 1) x += 1;
        int y= helper(dp,coins,amount, i+1,c);
        dp[i][amount]=Math.min(x,y);
        return dp[i][amount];
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int ele[]:dp){
              Arrays.fill(ele,-1);
        }
        
        int ans= helper(dp,coins,amount,0,0);
        return ans==Integer.MAX_VALUE-1 ? -1 :ans;
    }
}