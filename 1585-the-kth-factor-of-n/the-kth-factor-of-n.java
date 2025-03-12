class Solution {
    public int kthFactor(int n, int k) {
        
        int count=0;
        int ans=0;
        int i=1;
        while(i<=n && count<k){
            if(n%i==0){
                ans=i;
                count++;
            }
            i++;
        }
        return count==k?ans:-1;
    }
}