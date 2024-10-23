class Solution {
    public static int maxElement(int piles[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }return max;
    }
    public int hrcount(int []piles , int mid ){
        int result=0;

        for(int i=0;i<piles.length;i++){
            result+=Math.ceil((double)piles[i]/(double)mid);
        }
        return result;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxElement(piles);
        int ans=-1;
        while(low<=high){
            int mid=(high+low)/2;
            int total=hrcount(piles,mid);
            if(total<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
             }
        }
        return ans;
    }
}