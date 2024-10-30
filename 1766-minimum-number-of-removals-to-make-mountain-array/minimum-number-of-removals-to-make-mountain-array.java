class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int lis[]=new int[nums.length];
        int lds[]=new int[lis.length];
        Arrays.fill(lis,1);
        Arrays.fill(lds,1);
        //for Longest Increasing Subsequence

        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i])
                lis[i]=Math.max(lis[i],lis[j]+1);
            }
        }

        //For Longest Decresing subsequence 
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i])
                lds[i]=Math.max(lds[i],lds[j]+1);
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(lis[i]>1 && lds[i]>1){
            ans=Math.min(ans,nums.length-(lis[i]+lds[i]-1));
            }
        }
        return ans;
    }
}