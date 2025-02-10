class Solution {
  HashSet<Integer>set=new HashSet<>();
  HashMap<Integer,Integer>hm=new HashMap<>();

  int top=0;
    public Solution(int n, int[] blacklist) {
        for(int i=0;i<blacklist.length;i++){
            set.add(blacklist[i]);
        }
        top=n-blacklist.length;
       n--;
       for(int i=0;i<blacklist.length;i++){
        if(blacklist[i]<top){
            while(set.contains(n)){
                n--;
            }
            hm.put(blacklist[i],n);
            n--;
        }
       }




    }
    
    public int pick() {
        int ans=(int)(Math.random()*top);
        if(hm.containsKey(ans))return hm.get(ans);
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */