class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer>set=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
       
        for(int i=0;i<nums.length;i++){
            if(!set.containsKey(nums[i])){
                list.add(nums[i]);
              }
              set.put(nums[i],set.getOrDefault(nums[i],0)+1);
        }
       HashSet<Integer>ans=new HashSet<>();
        
        for(int i=0;i<list.size();i++){
            if(k==0){
               if(set.containsKey(k+list.get(i)) && set.get(k+list.get(i))>1){
                ans.add(k+list.get(i));
               }
            }
            else if(set.containsKey(k+list.get(i))){
            ans.add(k+list.get(i));
            }
        }
        return ans.size();
    }
}