class Solution {
    public long helper(int [][] questions ,int i ,long dp[]){
       if(i>questions.length-1)return 0;
       if(dp[i]!=0)return dp[i];
        
        long peak=questions[i][0]+helper(questions,i+questions[i][1]+1,dp);
        long npeak=helper(questions,i+1,dp);
        dp[i]=Math.max(peak,npeak);
        return Math.max(peak,npeak);

    }
    public long mostPoints(int[][] questions) {
        long dp[]=new long[questions.length];
        return helper(questions  , 0,dp); 
    }
}