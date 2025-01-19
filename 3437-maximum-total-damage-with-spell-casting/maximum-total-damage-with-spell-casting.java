class Solution {
    public long maximumTotalDamage(int[] power) {
        HashMap<Integer,Long>hm=new HashMap<>();
        List<Integer>list=new ArrayList<>();

        for(int i=0;i<power.length;i++){
            if(hm.containsKey(power[i])==false){
                list.add(power[i]);
            
            }
                hm.put(power[i],hm.getOrDefault(power[i],0l)+1);
            
        }
        Collections.sort(list);
        long dp[]=new long[list.size()];
           dp[0]=list.get(0)*hm.get(list.get(0));
        for(int i=1;i<list.size();i++){
            int current=list.get(i);
            dp[i]=dp[i-1];
            int j=i-1;
            while(j>=0 && list.get(j)>=current-2)j--;
            if(j>=0){
                dp[i]=Math.max(dp[i],dp[j]+current*hm.get(current));
            }else{
                dp[i]=Math.max(dp[i],current*hm.get(current));
            }
        }
        return dp[dp.length-1];
    }
}                                                 