class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
        int a=nums[i];
        int c=0;
        while(set.contains(a)==true){
            set.remove(a);
            c++;
             long next = (long) a * a; // Use long to avoid overflow on squaring
                if (next > Integer.MAX_VALUE) break;
                a = (int) next;
           
        }
        ans=Math.max(c,ans);
    
        }
        if(ans==1)return -1;
       else return ans;
    }
}