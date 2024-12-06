class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>set=new HashSet<>();
        int sum=0;
        int c=0;
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }

        for(int i=1;i<=n;i++){
            if(set.contains(i)==false){
                c++;
                sum=sum+i;
            }
            if(sum>maxSum)return c-1;
        }
        return c;
    }
}