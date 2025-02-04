class Solution {
    public int helper(int num){
        int ans=0;
        while(num!=0){
           int rem=num%10;
           num=num/10;
           ans+=rem*rem;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();

       while(n!=0){
       
         n=helper(n);
          if(set.contains(n)==true)return false;
         set.add(n);
         if(n==1)return true;
       }
       return false;
    }
}