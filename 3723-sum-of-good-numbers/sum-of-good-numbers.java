class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i-k >=0 && i+k<nums.length){
                sum+=(nums[i-k]<nums[i] && nums[i+k]<nums[i])?(nums[i]):(0);
            }else if(i-k>=0){
                 sum+=(nums[i-k]<nums[i])?(nums[i]):(0);
            }else if(i+k<nums.length){
                 sum+=(nums[i+k]<nums[i])?(nums[i]):(0);
            }else sum+=nums[i];
            
        }
        return sum;
    }
}