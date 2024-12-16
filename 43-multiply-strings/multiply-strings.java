class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        int result[]=new int[n+m];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int v=(num2.charAt(i)-'0')*(num1.charAt(j)-'0');
                int sum=v+result[i+j+1];
                result[i+j]+=sum/10;
                result[i+j+1]=sum%10;
                
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<result.length;i++){
            if(sb.length()==0 && result[i]==0)continue;
            sb.append(result[i]);
        }
        return sb.length()==0 ? "0" :sb.toString() ;
    }
}