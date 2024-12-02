class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int space=0;
        int n=searchWord.length();
        for(int i=0;i<=sentence.length()-n;i++){
             if(sentence.charAt(i)==' ')space++;
             if(sentence.substring(i,i+n).equals(searchWord)){
                if(i==0 || sentence.charAt(i-1)==' ')return space+1;
             }
        }
        return -1;
    }
}