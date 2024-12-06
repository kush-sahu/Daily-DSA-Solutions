class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        int n=str1.length();
        int m=str2.length();
        while(i<n && j<m){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(j);

            if(ch1!=ch2){
                if(ch1=='z'){
                    ch1='a';
                }else{
                    ch1++;
                }
            }
            if(ch1==ch2){
              j++;i++;
            }else{
                i++;
            } 
        }
        if(j>=m)return true;
        else return false;

    }
}