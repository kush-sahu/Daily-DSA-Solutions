class Solution {
    public int helper(List<Integer> nums,int i, int target, int dp[][]){
        if(target==0){
            return 0;
        }
        
        if(i<0 || target<0)return Integer.MIN_VALUE;
        if(dp[i][target]!=-1) return dp[i][target];
        int x=helper(nums, i-1, target-nums.get(i),dp);
        if(x!=Integer.MIN_VALUE)x+=1;
        int y=helper(nums, i-1, target,dp);
        dp[i][target]=Math.max(x,y);
        return Math.max(x,y);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int dp[][]=new int[nums.size()][target+1];
        for(int e[]:dp){
            Arrays.fill(e,-1);
        }
        int ans= helper(nums, nums.size()-1, target,dp);

        if(ans==Integer.MIN_VALUE)return -1;
        else return ans;
    }
}