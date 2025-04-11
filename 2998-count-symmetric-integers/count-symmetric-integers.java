class Solution {
    public boolean helper(String s){
        int p1=0;
        int p2=s.length()-1;
        int ans1=0;
        int ans2=0;
        while(p1<p2){
           ans1+=Integer.parseInt(s.charAt(p1)+"");
           ans2+=Integer.parseInt(s.charAt(p2)+"");
           p1++;
           p2--;
        }
        return ans1==ans2;
    }
    
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++){
            String s=Integer.toString(i);
            if(s.length()%2==0){
                if(helper(s))ans++;
            }
        }
        return ans;
    }
}