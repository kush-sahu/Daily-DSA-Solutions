class Solution {
    public int minimumSum(int[] nums) {
          int sufM[]=new int[nums.length];
       sufM[nums.length-1]=nums[nums.length-1];
       for(int i=nums.length-2;i>=0;i--){
        sufM[i]=Math.min(sufM[i+1],nums[i]);
       }
       int pMin=nums[0];
       int ans=Integer.MAX_VALUE;
       for(int i=1;i<nums.length-1;i++){
        if(pMin<nums[i]&&sufM[i+1]<nums[i])
            ans=Math.min(ans,(pMin+nums[i]+sufM[i+1]));
         pMin=Math.min(pMin,nums[i]);
         }
         return ans==Integer.MAX_VALUE ? -1 :ans;
    }
}






