class Solution {
    public boolean isCircularSentence(String sentence) {
        boolean ans=false;
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch==' '){
                   if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                    return false;
                   }else{
                    ans=true;
                   }
            }
        }

        if(sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
            return true;
        }
        else return false;

       
    }
}