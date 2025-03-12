class Solution {
    public int[] twoSum(int[] nums, int target) {
        
     HashMap<Integer,Integer>hm=new HashMap<>();
      
    for(int i=0;i<nums.length;i++){
        int a=target-nums[i];
        if(hm.containsKey(a)){
           return new int[]{hm.get(a),i};
        }
        hm.put(nums[i],i);
    }
    return new int[]{};                 
    } 
} 