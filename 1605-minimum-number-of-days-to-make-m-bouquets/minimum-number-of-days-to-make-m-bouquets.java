class Solution {
    public boolean helper(int day[],int m,int k,int mid){
       
       int count1=0;
        int count2=0;
       for(int i=0;i<day.length;i++){
       if(day[i]<=mid){
        count2++;
       }else{
        count2=0;
       }
        
        
        if(count2>=k){
            count1++;
            count2=0;
        }

        if(count1>=m)return true;
        
       }
       if(count1>=m)return true;
      else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=0;
        int high=0;
        for(int i=0;i<bloomDay.length;i++){
            high=Math.max(high,bloomDay[i]);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(bloomDay,m,k,mid)==true){
               ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }
}