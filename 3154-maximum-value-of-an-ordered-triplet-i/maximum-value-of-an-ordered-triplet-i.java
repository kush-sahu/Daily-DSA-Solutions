class Solution {
    public long maximumTripletValue(int[] nums) {
       int sufM[]=new int[nums.length];
       sufM[nums.length-1]=nums[nums.length-1];
       for(int i=nums.length-2;i>=0;i--){
        sufM[i]=Math.max(sufM[i+1],nums[i]);
       }
       int pMax=nums[0];
       long ans=Integer.MIN_VALUE;
       for(int i=1;i<nums.length-1;i++){
          ans=Math.max(ans,((long)(pMax-nums[i])*sufM[i+1]));
         pMax=Math.max(pMax,nums[i]);
         }
         return ans>=0 ? ans :0;
    }
}