class Solution {
    boolean dp[][]=new boolean[1001][1001];
    public boolean isPalindrome(String s, int i, int j){
       if(i>j)return true;
        if(dp[i][j]==true)return true;
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]= isPalindrome(s,i+1,j-1);
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return dp[i][j];
    }
    public String longestPalindrome(String s) {
        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],false);
        }
        int longest=0;
        int startIndex=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
              if(isPalindrome(s,i,j)==true){
                if(j-i+1>longest){
                    longest=j-i+1;
                    startIndex=i;
                }
              }
            }
        }
        String str=s.substring(startIndex,startIndex+longest);
        return str;
    }
}