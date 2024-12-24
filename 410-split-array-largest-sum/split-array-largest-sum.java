class Solution {
    public boolean helper(int nums[],int k,int mid){
        int sum=0;
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mid)return false;
            if(sum+nums[i]>mid){
                c++;
                sum=nums[i];
                if(c>k)return false;
            }else{
                sum+=nums[i];
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(nums,k,mid)==true){
               ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}