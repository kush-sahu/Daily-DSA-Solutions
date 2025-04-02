class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=Integer.MIN_VALUE;


        for(int i=0;i<nums.length-2;i++){
            for(int j =i+1;j<nums.length-1;j++){
                for(int k =j+1;k<nums.length;k++){
                    ans = Math.max(((long)(nums[i] - nums[j]) * nums[k]),ans);
                    
                }
            }
        }

      return ans>0?ans:0;
    }
}


