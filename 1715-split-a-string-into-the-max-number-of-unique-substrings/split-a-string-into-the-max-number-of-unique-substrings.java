class Solution {
    public int helper(String s, int i, HashSet<String>set){
       if(i>=s.length()){
        return set.size();
       }
        int ans=0;
        for(int j=i;j<s.length();j++){
            String a=s.substring(i,j+1);
            if(set.contains(a)==false){
                set.add(a);
                ans=Math.max(ans, helper(s,j+1,set));
                set.remove(a);
            }
        }
        return ans;
    }
    public int maxUniqueSplit(String s) {
        HashSet<String>set=new HashSet<>();
        
       return helper( s,0, set);
        
    }
}