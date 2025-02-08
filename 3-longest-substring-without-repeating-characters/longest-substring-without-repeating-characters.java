class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character>set=new HashSet<>();
        int ans=0;
        int st=0;
        int end=0;
        while(end<s.length()){
            char ch=s.charAt(end);
            if(!set.contains(ch)){
                set.add(ch);
              
            }else{
                while(st<s.length() && s.charAt(st)!=ch){
                 set.remove(s.charAt(st));
                 st++;
                }
                st++;
            }
              ans=Math.max(ans,set.size()); 
              end++;
        }
        return ans;
    }
}