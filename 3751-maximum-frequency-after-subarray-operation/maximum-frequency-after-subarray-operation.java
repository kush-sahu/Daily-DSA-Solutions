class Solution {
    public int maxFrequency(int[] nums, int k) {
        // HashMap<Integer,Integer>hm=new HashMap<>();
        //  int maxfre=0;
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==k){
        //         hm.clear();
        //         max++;
        //     }else{
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        //     maxfre=Math.max(hm.get(nums[i]),maxfre);
        //   }
        // }
      
        // return maxfre+max;

        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==k)cnt++;
        }

        int ans=cnt;
        
        for(int i=1;i<=50;i++){
            
           int maxi=0;
        int numCount=0;
        if(i==k)continue;

        for(int j=0;j<n;j++){
            if(numCount<0){
                numCount=0;
            }
            if(nums[j]==i){
                numCount++;
            }
            else if(nums[j]==k){
                numCount--;
            }
            maxi=Math.max(maxi,numCount);
        }
        ans=Math.max(ans,maxi+cnt);

        }
       return ans;
        
    }
}
