class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int st=0;
        int end=0;
        int ans=0;
      
        while(end<s.length()){
            char ch=s.charAt(end);
            if(set.contains(ch)==true){
            
              while(s.charAt(st)!=ch){
                set.remove(s.charAt(st));
                st++;
              }
              
              st++;
            }
                 set.add(ch);
                ans=Math.max(end-st+1,ans);
            
                
                end++;
          
            }
        
        return ans;
    }
}