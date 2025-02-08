class Solution {
    public int reverse(int x) {
       long num=0;
       boolean sign=false;
       if(x<0){
        sign=true;
        x=x*(-1);
       }


       while(x!=0){
        int rem=x%10;
        num=num*10+rem;
        x=x/10;
       }

       if(sign==true){
        num=num*(-1);
       } 

       if(num<=Integer.MIN_VALUE){
        return 0;
       }else if(num>=Integer.MAX_VALUE){
        return 0;
       }else return (int)num;
    }
}