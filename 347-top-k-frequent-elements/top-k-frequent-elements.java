class Pair{
    int key;
    int value;
       Pair(int key, int value){
        this.key=key;
        this.value=value;
       }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p2.key - p1.key);
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans[]=new int[k];
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
           pq.add(new Pair(hm.get(nums[i]),nums[i]));
        }
        int i=0;
        while(i<k){
            Pair p=pq.remove();
            if(!set.contains(p.value))
            {
            ans[i]=p.value;
            set.add(p.value);
            i++;
            }
            
        }
       return ans;
    }
}