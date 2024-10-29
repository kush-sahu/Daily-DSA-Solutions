class Solution {
    public int lengthOfLastWord(String s) {
       
        StringBuilder sb=new StringBuilder();
     
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' ' && sb.length()>0){
               break;
            }
            if(ch!=' '){
                sb.append(ch);
            }


        }return sb.length();

    }
}