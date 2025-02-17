class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>hm=new HashMap<>();
        int st=0;
        int end=0;
        int ans=0;
        while(end<s.length()){
            hm.put(s.charAt(end),hm.getOrDefault(s.charAt(end),0)+1);
            int mx=0;
            for(char c='A';c<='Z';c++){
            mx=Math.max(hm.getOrDefault(c,0),mx);
            }

            if((end+1-st)-mx<=k){
                ans=Math.max(end+1-st,ans);
                end++;
            }else{
                  hm.put(s.charAt(st),hm.getOrDefault(s.charAt(st),0)-1);
                   st++;
                  ans=Math.max(end+1-st,ans);
                 
                  end++;
            }
        }
        return ans;
    }
}