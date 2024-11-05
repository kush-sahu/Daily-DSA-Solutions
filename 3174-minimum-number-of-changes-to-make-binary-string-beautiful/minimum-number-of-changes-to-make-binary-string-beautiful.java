class Solution {
    public int minChanges(String s) {
        int count=0;
        for(int i=0;i<s.length();i+=2){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
           if(ch1!=ch2){
             count++;
           }
        }
        // int count1=0;
        // for(int i=s.length()-1;i>=0;i-=2){
        //     char ch1=s.charAt(i);
        //     char ch2=s.charAt(i-1);
        //    if(ch1!=ch2){
        //      count1++;
        //    }
        // }
        // return Math.min(count,count1);
    return count;
    }
}