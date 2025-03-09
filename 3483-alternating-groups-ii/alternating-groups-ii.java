class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        ArrayList<Integer>list=new ArrayList<>();
            int n=colors.length;
        for(int i=0;i<n*2;i++){
            list.add(colors[i%n]);
        }
        int st=0;
        int end=1;
        int c=1;
        int ans=0;
        int loopCount=0;
    
        while(st<list.size()/2){
            if(list.get(end-1)!=list.get(end)){
                c++;
            }else{
              st=end;
              c=1;
            }
            if(c==k){
            ans++;
            c--;
            st+=1;
           }
           end++;          
        }

        return ans;
    }
}