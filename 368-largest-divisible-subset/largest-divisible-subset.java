class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int dp[]=new int[nums.length];
        int prev[]=new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        int max=0;
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            int j=0;
            while(j<i){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                   
                      dp[i]=dp[j]+1;
                      prev[i]=j;
                    
                    
                }
                j++;
            }
              if(dp[i]>dp[max])max=i;
        }

        for(int i=max;i>=0;i=prev[i]){
          list.add(nums[i]);
        }
        return list;
    }
}