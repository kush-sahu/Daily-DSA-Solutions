class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int num=i;
            int count=0;
            while(num!=0){
                int lsb=num & 1;
                if(lsb!=0)count++;
                num=num>>1;
            }
            arr[i]=count;
        }
        return arr;
    }
}