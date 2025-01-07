class Solution {
    public int trap(int[] height) {
        int pre[]=new int[height.length];
        pre[0]=height[0];
        for(int i=1;i<height.length;i++){
            pre[i]=Math.max(pre[i-1],height[i]);
        }
        int suf[]=new int[height.length];
        suf[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],height[i]);
        }
       int ans=0;

       for(int i=1;i<height.length;i++){
        if(Math.min(pre[i],suf[i])-height[i]>0){
            ans+=Math.min(pre[i],suf[i])-height[i];
        }
       }
       return ans;
    }
}