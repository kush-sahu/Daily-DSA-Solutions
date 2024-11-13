class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n=nums.length;
        long m=n-1;
        long pair=m*(m+1)/2;
        //c1 for count of pair less then lower
        long c1=0;
        //c2 for count of pair greater then upper
        long c2=0;
        int i=0;
        int j=n-1;
        while(i<j){
            if(nums[i]+nums[j]<lower){
                c1+=(long)j-i;
                i++;
            }else{
                j--;
            }
        }
      
         i=0;
         j=n-1;
        while(i<j){
            if(nums[i]+nums[j]>upper){
                c2+=(long)j-i;
                j--;
            }else{
                i++;
            }
        }
        return (long)pair-c1-c2;

    }
}