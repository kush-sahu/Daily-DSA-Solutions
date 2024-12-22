class Solution {
    public boolean helper(int wei[],int days,int mid){
        int count=0;
        int c=0;
        for(int i=0;i<wei.length;i++){
            if(wei[i]>mid)return false;
            if(count<=mid){
                count+=wei[i];
            } 
           
            if(count>mid){
                c++;
                count=wei[i];
            }
        }
        if(count<=mid) c++;
        else c+=2;
        if(c<=days)return true;
        else return false;
    }
    public int shipWithinDays(int[] weights, int days) {
          int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(weights,days,mid)==true){
               ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}