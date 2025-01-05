class Solution {
    public int helper(int n, int dp[]){
       if(n==0)return 0;
       if(n==1)return 1;
       if(dp[n]!=-1)return dp[n];
       int count=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int x=helper(n-i*i,dp);
            count=Math.min(x,count);
            }
            dp[n]=count+1;
        return count+1;
    }
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
}