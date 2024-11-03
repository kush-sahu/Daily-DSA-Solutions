class Solution {
    public int helper(int nums[],int i,int k,int dp[]){
        if(i>=nums.length-1)return 0;
        if(nums[i]==0)return Integer.MAX_VALUE;
        if(dp[i]!=-1)return dp[i];
        int ans=Integer.MAX_VALUE;
        for(int j=1;j<=k ;j++){
            if(i+j<nums.length){
            int x=helper(nums,i+j,nums[i+j],dp);
            if(x!=Integer.MAX_VALUE)x+=1;
            ans=Math.min(ans,x);
            }
        }
        dp[i]=ans;
        return ans;
    }
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
    
         int result = helper(nums, 0, nums[0], dp);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}

