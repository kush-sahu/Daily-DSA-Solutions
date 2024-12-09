class Solution {
    public int maxAscendingSum(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                a+=nums[i];
            }else{
                pq.add(a);
                a=nums[i];
            }
        }
        if(a>0)pq.offer(a);
        return pq.peek();
    }
}