class Solution {
    int fg=0;
    int sg=0;
    int low=Integer.MAX_VALUE;
    public void helper(int []nums){
           fg=0;
           sg=0;
        for(int i=0;i<nums.length;i++){
            low=Math.min(low,nums[i]);
            if(fg==nums[i]){
                continue;
            }else if(fg==0){
                fg=nums[i];
            }else if(sg==0 && nums[i]<fg){
                sg=nums[i];
            }else if(fg<nums[i]){
                sg=fg;
                fg=nums[i];
            }else if(sg<nums[i]){
                sg=nums[i];
            }
        }
        
    }
    public int minOperations(int[] nums, int k) {
         helper(nums);
         if(low<k)return -1;
         if(sg!=0 && sg<k)return -1;
         if(fg==k)return 0;
         if(fg<k)return -1;
         int ans=0;
         
         while(sg!=0 && sg!=k){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>sg)nums[i]=sg;
            }     
            helper(nums);
            if(sg==0)sg=k;
            if(fg<k)return -1;
            ans++;
         }
         return ans+1;
    }
}