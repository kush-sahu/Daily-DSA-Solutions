class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[nums.length-k+1];
        for(int i=0;i<=n-k;i++){
          
                int a=nums[i];
            for(int j=i+1;j<i+k;j++){
                  
                if(nums[j]-a ==1)
                {
                a=nums[j];
                }else{
                  a=-1;
                  break;
                } 
            }
           
            ans[i]=a;
        }
        return ans;

    }
}