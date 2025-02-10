class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int ans[]=new int[queries.length];

        for(int i=0;i<queries.length;i++){
           pq.add(Math.abs(queries[i][0])+Math.abs(queries[i][1]));
           if(pq.size()>k )pq.remove();
           if(pq.size()>=k)ans[i]=pq.peek();
           else ans[i]=-1;
        }
        return ans;
    }
}