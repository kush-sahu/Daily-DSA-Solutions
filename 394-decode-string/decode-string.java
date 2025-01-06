class Solution {
    public String decodeString(String s) {
        Stack<String>st=new Stack<>();
        for(int i=0;i<s.length();i++){
           if(st.size()==0 || !s.substring(i,i+1).equals("]")){
            st.push(s.substring(i,i+1));
           }else if(s.substring(i,i+1).equals("]")){

            String sb="";
            while(st.size()!=0 && !st.peek().equals("[")){
                sb=st.pop()+sb;
            }
            if(st.peek().equals("["))st.pop();
            
            if(Character.isDigit(st.peek().charAt(0))){
                String n="";
                while(st.size()!=0 && Character.isDigit(st.peek().charAt(0))){
                 n=st.pop()+n;
                }
                int num=Integer.parseInt(n);
                String str=sb;
                for(int j=1;j<num;j++){
                    sb=str+sb;
                }
                
            }
            st.push(sb);
           }
           
        }
        String ans="";
           while(st.size()>0){
            ans=st.pop()+ans;
           }
           return ans;
    }
}