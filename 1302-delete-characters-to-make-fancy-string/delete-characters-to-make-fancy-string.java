class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int ans=1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-1);
            if(ch1==ch2){
                if(ans+1<3){
                    sb.append(ch1);
                    ans++;
                }
            }else{
                if(ans<3){
                    sb.append(ch1);
                    ans=1;
                }
            }
        }
        return sb.toString();
    }
}