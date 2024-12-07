class Solution {
    public boolean helper(int nums[], int maxOperations, int mid){
        int operation=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid==0){
                operation+=(nums[i]/mid)-1;
            }else{
                operation+=(nums[i]/mid);
            }
        }
        if(operation>maxOperations)return false;
        else return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int max=0;
         for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
         }

         int l=1;
         int h=max;
         int ans=0;
         while(l<=h){
            int mid=l+(h-l)/2;
            if(helper(nums,maxOperations,mid)==true){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
         }
         return ans;
    }
}