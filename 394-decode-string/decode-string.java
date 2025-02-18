class Solution {
    public String decodeString(String s) {
        Stack<String>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0 || s.charAt(i)!=']'){
                st.push(s.charAt(i)+"");
            }else {
                String sb="";
                while(st.size()>0 && !st.peek().equals("[")){
                  sb=st.pop()+sb;
                }
                if(st.size()>0 && st.peek().equals("["))st.pop();
                if(st.size()>0 && st.peek().charAt(0)>='0' && st.peek().charAt(0)<='9'){
                String n="";
                while(st.size()>0 && st.peek().charAt(0)>='0' && st.peek().charAt(0)<='9'){
                     n=st.pop()+n;
                }
                String str=sb;
                int num=Integer.parseInt(n);
                for(int j=1;j<num;j++){
                 sb=str+sb;
                }
                }
                st.push(sb);
            }
        }
        String ans="";
        while(st.size()!=0){
            ans=st.pop()+ans;
        }
        return ans;
    }
}