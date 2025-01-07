class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        // if(strs.length==1)return 
        for(int i=1;i<strs.length;i++){
           StringBuilder sb=new StringBuilder();
            String st=strs[i];
            int j=0;
            int n=Math.min(st.length(),s.length());
            while(j<n ){
                if(st.charAt(j)==s.charAt(j)){
                    sb.append(st.charAt(j));
                }else break;
                j++;
            }
            s=sb.toString();
            if(s.length()==0)return "";
        }
        return s;
    }
}