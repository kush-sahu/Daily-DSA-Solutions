class Solution {
    public long minEnd(int n, int x) {
        
  // Approch 1 TLE
        // int c=0;
        // long ans=(long)x;
        // while(c<n){
        //     if((x & ans)==x){
        //         c++;
        //     }
        //     ans++;
        // }
        // return ans-1;

    // Approch 2
    long num=(long)x;
     for(int i=1;i<n;i++){
        num=(num+1)|x;
     }
     return num;
    } 
}