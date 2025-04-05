class Solution {
    public int subsetXORSum(int[] nums) {
        int ans=0;


        for(int i=0;i<nums.length;i++){
            ans=nums[i]|ans;
        }
        return ans * (int)Math.pow(2,(nums.length-1));
    }
}