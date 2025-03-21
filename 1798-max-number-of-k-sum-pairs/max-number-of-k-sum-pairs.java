class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int pair=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==k){
                pair++;
                i++;
                j--;
            }else if(sum<k){
                i++;
            }else{
                j--;
            }
        }
        return pair;
    }
}