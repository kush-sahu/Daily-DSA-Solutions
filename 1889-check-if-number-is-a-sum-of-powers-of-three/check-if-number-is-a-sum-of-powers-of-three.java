// correct but not suitable for tthis question
// class Solution {
//     public static boolean helper(int ans, int cnt,int n){
//        if(ans==n)return true;
//        if(ans>n)return false;

//         boolean x=helper(ans+(int)Math.pow(3,cnt),cnt+1,n);
//          boolean y=helper(ans,cnt+1,n);

//          return x||y;
//     }
//     public boolean checkPowersOfThree(int n) {
//          if(n<100)
//             return helper(0,0,n);
//        else return false;
//     }
// }





class Solution {
   
    public boolean checkPowersOfThree(int n) {
         while(n>0){
            if(n%3==2)return false;
            n/=3;
         }
         return true;
    }
}
