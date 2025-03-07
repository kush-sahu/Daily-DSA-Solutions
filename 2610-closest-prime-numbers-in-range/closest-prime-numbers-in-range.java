class Solution {
    public static void sive(int ans[],int right){
        ans[0]=1;
        ans[1]=1;
        for(int i=2;i<=right;i++){
            if(ans[i]==0){
                for(int j=i;j<=right;j+=i){
                    ans[j]=1;
                }
                ans[i]=0;
            }
            
        }
    }
   public static int nextPrime(int ans[],int n){
    
    while(n<ans.length &&  ans[n]!=0){
        n++;
    }
    return n;
   }
    public int[] closestPrimes(int left, int right) {
        int ans[]=new int[right+1];
        sive(ans, right);
        int result[]=new int[2];
        Arrays.fill(result,-1);
        int n1=nextPrime(ans,left);
        int diff=Integer.MAX_VALUE;
        while(n1<right){
            int n2=nextPrime(ans,n1+1);
            if(n2>right)break;
            if(n2-n1<diff){
                result[0]=n1;
                result[1]=n2;
                diff=n2-n1;
            }
            n1=n2;
        }
        return result;
    }
}









