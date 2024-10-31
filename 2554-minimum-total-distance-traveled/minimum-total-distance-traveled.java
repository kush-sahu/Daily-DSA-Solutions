class Solution {
    private static final long INF = 9007199254740991L;
    public long knapsack(int n, int m,List<Integer> robot, List<Integer>fact,long dp[][]){
      if(n<0)return 0;
      if(m<0)return INF;
      if(dp[n][m]!=-1)return dp[n][m];


        long notpeak=knapsack(n,m-1,robot,fact,dp);
        long peak=knapsack(n-1,m-1,robot,fact,dp) + Math.abs(robot.get(n)-fact.get(m));

        dp[n][m]=Math.min(notpeak,peak);

        return dp[n][m];
    }
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);

        int n=robot.size();
        int m = Arrays.stream(factory).mapToInt(f -> f[1]).sum();
        long dp[][]=new long[n][m+1];
        for (int i = 0; i < n; i++) {
    Arrays.fill(dp[i], -1);
}

        ArrayList<Integer>fact=new ArrayList<>();
       for (int[] f : factory) { int position = f[0]; int limit = f[1]; for (int j = 0; j < limit; j++) fact.add(position); }
     Collections.sort(fact);
        return knapsack(n-1,fact.size()-1,robot,fact,dp);

    }
}