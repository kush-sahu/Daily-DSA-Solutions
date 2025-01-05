class Solution {
    public int climb(int n,int i, int dp[]) {
        if(i==n)return 1;
        if(i>n)return 0;
        if(dp[i]!=-1)return dp[i];
        int x=climb(n,i+1,dp);
        int y=climb(n,i+2,dp);
        dp[i]=x+y;
        return x+y;
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int x=climb(n,0,dp);
        return x;
    }
}