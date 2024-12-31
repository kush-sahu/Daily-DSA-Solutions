class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         HashSet<Integer>set1=new HashSet<>();
         HashSet<Integer>set2=new HashSet<>();
         for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
         }
          for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
         }
         ArrayList<Integer>list1=new ArrayList<>();
         ArrayList<Integer>list2=new ArrayList<>();
          for(int ele : set1){
            if(!set2.contains(ele)){
                list1.add(ele);
            }
         }
          for(int ele : set2){
            if(!set1.contains(ele)){
                list2.add(ele);
            }
         }
         ArrayList<List<Integer>> ans=new ArrayList<>();
         ans.add(list1);
         ans.add(list2);
         return ans;
    }
}