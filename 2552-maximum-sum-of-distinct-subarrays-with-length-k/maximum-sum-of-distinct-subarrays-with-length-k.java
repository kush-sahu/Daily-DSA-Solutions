class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>set=new HashMap<>();
        long ans=0;
        int i=0;
        int j=0;
        long sum=0;
        while(j<nums.length){

          if(set.size()==k){
            ans=Math.max(sum,ans);
          }
          if(j<k){
            sum+=nums[j];
            set.put(nums[j],set.getOrDefault(nums[j],0)+1);
          }else{
            sum=sum-nums[i]+nums[j];
           
            set.put(nums[i],set.getOrDefault(nums[i],0)-1);
            if(set.get(nums[i])==0)set.remove(nums[i]);
            set.put(nums[j],set.getOrDefault(nums[j],0)+1);
            
            i++;
          }
          j++;

        }
        if(set.size()==k){
            ans=Math.max(sum,ans);
          }
        return ans;
    }
}