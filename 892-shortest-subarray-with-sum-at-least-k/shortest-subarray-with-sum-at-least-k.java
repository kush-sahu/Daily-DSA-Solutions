class Value{
    long ps;
    int idx;
    public Value(long ps,int idx){
        this.ps=ps;
        this.idx=idx;
    }
}
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        PriorityQueue<Value>pq=new PriorityQueue<>(
            (a,b)->Long.compare(a.ps,b.ps)
        );
        int n=nums.length;
        long csum=0;
        
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            csum+=nums[i];

            if(csum>=k){
                ans=Math.min(ans,i+1);
            }

            while(pq.size()>0 && csum-pq.peek().ps>=k){
                Value pice=pq.poll();
                ans=Math.min(ans,i-pice.idx);
            }
            pq.offer(new Value(csum,i));
        }

        if(ans==Integer.MAX_VALUE)return -1;
        else return ans;
    }
}