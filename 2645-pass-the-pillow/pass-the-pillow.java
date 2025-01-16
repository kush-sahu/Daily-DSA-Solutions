class Solution {
    public int passThePillow(int n, int time) {
        int dir=0;
        int no=1;
        while(time-1>=0){
         if(no==1)dir=0;
         if(no==n)dir=1;
         if(dir==0)no++;
         else no--;
         time--;
        }
        return no;
    }
}