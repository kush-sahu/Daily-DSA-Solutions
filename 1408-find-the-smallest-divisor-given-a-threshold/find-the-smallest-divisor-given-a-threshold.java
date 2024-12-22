class Solution {
    public boolean helper(int num[],int th, int mid){
        int a=0;
        for(int i=0;i<num.length;i++){
            a+=Math.ceil((double)num[i]/(double)mid);
        }
        if(a<=th)return true;
        else return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
          int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(nums,threshold,mid)==true){
               ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }
}