class Solution {
    public int minimumRecolors(String blocks, int k) {
        int st=0;
        int end=0;
        int wc=0;
        int ans=Integer.MAX_VALUE;
        while(end<blocks.length()){
            if(end<k){
               if(blocks.charAt(end)=='W')wc++;
            }else{
               ans=Math.min(wc,ans);
               if(blocks.charAt(st)=='W')wc--;
               if(blocks.charAt(end)=='W')wc++;
               st++;
            }
            end++;
        }
        ans=Math.min(wc,ans);
        return ans;
    }
}