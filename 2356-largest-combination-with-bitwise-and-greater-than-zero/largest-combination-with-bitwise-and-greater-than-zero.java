class Solution {
    public int largestCombination(int[] candidates) {
        int bit[]=new int[33];
      Arrays.fill(bit,0);
       int ans=0;
       for(int i=0;i<candidates.length;i++){
        int n=candidates[i];
        for(int j=1;j<=32;j++){
            if(((n&(1<<j))!=0)){
                bit[j]=bit[j]+1;
                ans=Math.max(ans,bit[j]);
            }
        }
       }
       return ans;
    }
}