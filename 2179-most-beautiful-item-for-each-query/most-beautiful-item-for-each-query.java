class Solution {
    public class Pair implements Comparable<Pair>{
        int a;
        int b;
        public Pair(int a, int b){
            this.a=a;
            this.b=b;
        }
        public int compareTo(Pair o){
            return this.a-o.a;
        }
    }
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Pair[] pairs=new Pair [items.length];
        for(int i=0;i<items.length;i++){
            pairs[i]=new Pair(items[i][0],items[i][1]);
        }
        Arrays.sort(pairs);
        int prefix[]=new int[items.length];
        prefix[0]=pairs[0].b;
        for(int i=1;i<items.length;i++){
            prefix[i]=Math.max(prefix[i-1],pairs[i].b);
        }
        for(int i=0;i<queries.length;i++){
            int ans=0;
            int low=0;
            int high=items.length-1;

            while(low<=high){
                int mid=low+(high-low)/2;

                if(pairs[mid].a<=queries[i]){
                    ans=prefix[mid];
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            queries[i]=ans;
        }
        return queries;
    }
}