class Solution {
    public boolean helper(int nums[],int i, Boolean dp[][],int sum,int ans){
       if(sum==ans)return true;
       if(sum>ans)return false;
       if(i>=nums.length)return false;
       if(dp[i][sum]!=null)return dp[i][sum];
       Boolean l=helper(nums,i+1,dp,sum+nums[i],ans);
       Boolean r=helper(nums,i+1,dp,sum,ans);
       dp[i][sum]=l||r;
      return l||r;
        
    }
     
    public boolean canPartition(int[] nums) {
         int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;
        Boolean dp[][]=new Boolean[nums.length][(sum/2)+1];
        // Arrays.fill(dp,true);
        return helper(nums,0,dp,0,sum/2);
    }
}