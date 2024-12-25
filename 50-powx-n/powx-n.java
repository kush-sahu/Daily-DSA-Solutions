class Solution {
    public double myPow(double x, int n) {
        long m=n;
        if(n<0)m=-1*m;
        double ans=1.0;

        while(m>0){
            if(m%2==1){
                ans=ans*x;
                m=m-1;
            }else{
                x=x*x;
                m=m/2;
            }
        }
        if(n<0)return (double) 1/ans;
        else return ans;
    }
}