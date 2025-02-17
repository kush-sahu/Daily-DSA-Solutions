class Solution {
    public long findMaximumScore(List<Integer> nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());


        int num=nums.get(0);
        pq.add(nums.get(0));

        int p=nums.get(0);
        int p1=0;
        long ans=0;
        for(int i=1;i<nums.size();i++){
            pq.add(nums.get(i));
            if(p<pq.peek()){
             ans+=(long)(i-p1)*p;
             p=pq.peek();
             p1=i;
            }
        }
        if(p1!=nums.size()-1){
            ans+=(long)(nums.size()-1-p1)*(long)(nums.get(p1));
        }
        return ans;
    }
}