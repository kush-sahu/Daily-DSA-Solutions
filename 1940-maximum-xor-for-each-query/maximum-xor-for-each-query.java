class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int m=(int)Math.pow(2,maximumBit)-1;
        int arr[]=new int[nums.length];
         int ans=0;
        for(int i=nums.length-1;i>=0;i--){
            arr[nums.length-i-1]=xor^m;
          
           xor=xor^nums[i];
          
        }
     return arr;
    }
}