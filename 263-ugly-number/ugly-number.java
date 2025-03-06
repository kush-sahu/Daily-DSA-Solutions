class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        int ans[]={2,3,5};
        for(int i=0;i<3;i++){
        while(n%ans[i]==0){
            n/=ans[i];
          }
        }
        return n==1;
    }
}