class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=0;
        int size=wall.size();
       
        for(int i=0;i<wall.size();i++){
           List<Integer>list=wall.get(i);
           int presum=0;
           for(int j=list.size()-1;j>0;j--){
            presum+=list.get(j);
            
             hm.put(presum,hm.getOrDefault(presum,0)+1);
            
           
            ans=Math.max(ans,hm.get(presum));
           }
        }
        return size-ans;
    }
}