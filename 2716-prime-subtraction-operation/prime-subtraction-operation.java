class Solution {
    boolean arr[]=new boolean[1000];
   public void prime(boolean arr[]){
   Arrays.fill(arr,true);
   arr[0]=false;
   arr[1]=false;
      for(int i=2;i*i<1000;i++){ 
           if(arr[i]==true){
             for(int j=i*i;j<1000;j+=i){
                 arr[j]=false;
                 }
            }
        }
   }
    public boolean primeSubOperation(int[] nums) {
        prime(arr);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                continue;
            }

            for(int j=2;j<nums[i];j++){
                if(arr[j]==true){
                if(nums[i]-j<nums[i+1]){
                    nums[i]=nums[i]-j;
                    break;
                }
                }
                
            }
            if(nums[i]>=nums[i+1])return false;
        }
        return true;
    }
}