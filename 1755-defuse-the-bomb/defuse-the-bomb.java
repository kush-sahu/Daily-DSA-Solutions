class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            if(k>0){
                
                for(int j=i+1;j<=i+k;j++){
                    if(j<n){
                           sum+=code[j];
                    }else{
                        sum+=code[j%n];
                    }
                }
            }else if(k<0){
                for(int j=i-1;j>=i+k;j--){
                    if(j<0){
                           sum+=code[(n+j)];
                    }else{
                        sum+=code[j];
                    }
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}