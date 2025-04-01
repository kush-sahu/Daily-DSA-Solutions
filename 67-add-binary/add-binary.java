class Solution {
    public String addBinary(String a, String b) {
 
     String s="";
     int i=a.length()-1;
     int j=b.length()-1;
     char c='0';
    while(i>=0 && j>=0){
        char  c1=a.charAt(i);
        char  c2=b.charAt(j);
        if(c1=='1' && c2=='1' && c=='0'){
             s='0'+s;
             c='1';
        }else  if(c1=='0' && c2=='0' && c=='0'){
             s='0'+s;
        }else if((c1=='1' && c2=='0' && c=='0')|| (c1=='0' && c2=='1' && c=='0')){
             s='1'+s;
        }else if(c1=='1' && c2=='1' && c=='1'){
             s='1'+s;
             c='1';
        }else if((c1=='1' && c2=='0' && c=='1')|| (c1=='0' && c2=='1' && c=='1')){
             s='0'+s;
             c='1';
        }else if(c1=='0' && c2=='0' && c=='1'){
            s='1'+s;
            c='0';
        }
        i--;
        j--;
        
     }
     while(i>=0){
        if(c=='0'){
            s=a.charAt(i)+s;
        }else if(c=='1' && a.charAt(i)=='1'){
            s='0'+s;
            c='1';
        }else if(c=='1' && a.charAt(i)=='0'){
            s='1'+s;
            c='0';
        }
        i--;
     }
     while(j>=0){
        if(c=='0'){
            s=b.charAt(j)+s;
        }else if(c=='1' && b.charAt(j)=='1'){
            s='0'+s;
            c='1';
        }else if(c=='1' && b.charAt(j)=='0'){
            s='1'+s;
            c='0';
        }
        j--;
     }
     if(c=='1')s='1'+s;
        
     return s;
    }
}