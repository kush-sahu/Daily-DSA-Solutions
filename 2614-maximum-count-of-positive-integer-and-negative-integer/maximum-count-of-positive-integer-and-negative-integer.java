class Solution {
    public int maximumCount(int[] nums) {
        int n=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num==0)continue;
          if(num<0)n++;
          else p++;
        }
        return (n>=p)?(n):(p);
    }
}