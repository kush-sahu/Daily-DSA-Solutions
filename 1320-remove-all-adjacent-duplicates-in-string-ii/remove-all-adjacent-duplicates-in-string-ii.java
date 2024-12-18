class Solution {
    class Pair{
        char c;
        int f;
        Pair(char c, int f){
            this.c=c;
            this.f=f;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair>st=new Stack<>();
        
       for(int i=0;i<s.length();i++){
        if(st.size()==0){
            Pair pair = new Pair(s.charAt(i), 1);
            st.push(pair);
        }else if(st.peek().c==s.charAt(i)){
            Pair pair=st.peek();
            if(pair.f==k-1){
                st.pop();
            }else{
            pair =st.pop();   
            pair=new Pair(pair.c,pair.f+1);
            st.push(pair);
            }
        }else{
            Pair pair=new Pair(s.charAt(i),1);
            st.push(pair);
        }
       }






        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            Pair pair=st.pop();
            char c=pair.c;
            int n=pair.f;
            for(int i=0;i<n;i++){
                sb.append(c);
            }
        }
        sb.reverse();
        return sb.toString();
        
        
    }
}
