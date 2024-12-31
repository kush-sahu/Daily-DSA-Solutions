class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int ele : arr){
          hm.put(ele,hm.getOrDefault(ele,0)+1);
        } 

        HashSet<Integer>set=new HashSet<>();

        for(int ele : hm.values()){
            if(set.contains(ele))return false;
            set.add(ele);
        }
        return true;
    }
}