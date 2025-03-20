class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum[]=new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }

        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1); // for default values on index 0
        int ans=0;
        for(int i=0;i<nums.length;i++){
           
           int diff=prefixSum[i]-k;
           if(hm.containsKey(diff)){
            ans=ans+hm.get(diff);
           }
           hm.put(prefixSum[i],hm.getOrDefault(prefixSum[i],0)+1);

           
        }
        return ans;
    }
}