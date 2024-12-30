class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)return nums[0];
        int i=0;
        int j=0;
        int sum=0;
        double avg=Double.NEGATIVE_INFINITY;
        boolean neg=true;
        while(j<nums.length){
            if(j<k){
                sum+=nums[j];
            }else {
               avg=(double)Math.max(avg,(double)sum/k);
                sum+=nums[j];
                sum-=nums[i];
                i++;
            }
            j++;
        }
         avg=(double)Math.max(avg,(double)sum/k);
         return avg;
    }
}