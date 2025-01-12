class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0 || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                st.push(s.charAt(i));
            }else{
                if(st.size()>0){
                    st.pop();
                }
            }
        }
        String ans="";
        while(st.size()>0){
            ans=st.pop()+ans;
        }
        return ans;
    }
}