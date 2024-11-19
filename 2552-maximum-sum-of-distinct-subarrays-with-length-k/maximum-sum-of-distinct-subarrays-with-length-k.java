class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>set=new HashMap<>();
        int n=nums.length;
        int st=0;
        
        int end;
        
        long ans=0;
        long sum=0;
        for(end=0;end<k;end++){
            
                sum+=nums[end];
                set.put(nums[end],set.getOrDefault(nums[end],0)+1);
                
            }
            if(set.size()==k){
                  ans=Math.max(ans,sum);
            }
           
        while(end<n){
            sum-=nums[st];
             set.put(nums[st],set.get(nums[st])-1);
             if(set.get(nums[st])==0){
                set.remove(nums[st]);
             }
            sum+=nums[end];
            set.put(nums[end],set.getOrDefault(nums[end],0)+1);
            
            if(set.size()==k){
                ans=Math.max(ans,sum);
            }
            end++;
            st++;
            
        }
        return ans;
    }
}