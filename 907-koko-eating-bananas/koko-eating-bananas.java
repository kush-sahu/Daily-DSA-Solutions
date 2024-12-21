class Solution {
    public boolean helper(int piles[],int mid,int h){
        int c=0;
        for(int i=0;i<piles.length;i++){
            c+=Math.ceil((double)piles[i]/(double)mid);
        }
         if(c<=h)return true;
        else return false;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int hi=0;
        for(int i=0;i<piles.length;i++){
            hi=Math.max(piles[i],hi);
        }
        int ans=Integer.MAX_VALUE;
        while(l<=hi){
            int mid=l+(hi-l)/2;
            if(helper(piles,mid,h)==true){
               ans=Math.min(ans,mid);
               hi=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}