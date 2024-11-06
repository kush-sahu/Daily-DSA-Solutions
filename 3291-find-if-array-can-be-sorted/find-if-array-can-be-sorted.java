class Solution {
    public void setBits(int bit[],int nums[]){
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int c=0;
            for (int j = 1; j <= 32; j++) {
            if ((n & (1 << (j - 1))) != 0) {
                c++;
               }
            }
            bit[i]=c;
        }
    }
    public int bits(int num){
         int n=num;
            int c=0;
            for (int j = 1; j <= 32; j++) {
            if ((n & (1 << (j - 1))) != 0) {
                c++;
               }
            }
            return c;
    }
    public boolean canSortArray(int[] nums) {
         int bit[]=new int[nums.length];
         setBits(bit,nums);
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]&& bit[j]==bit[j+1]){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                }else if((nums[j]>nums[j+1]&& bit[j]!=bit[j+1])){
                    return false;
                }
            }
        }
        return true;
    }
}