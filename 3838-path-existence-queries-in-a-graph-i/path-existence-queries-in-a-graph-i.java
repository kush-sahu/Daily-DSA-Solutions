class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean ans[]=new boolean[queries.length];
        int grp[]=new int[n];
        int groupNumber=1;
         grp[0]=groupNumber;
        for(int i=1;i<n;i++){
            if(Math.abs(nums[i]-nums[i-1])<=maxDiff){
                grp[i]=groupNumber;
            }else{
                groupNumber++;
                grp[i]=groupNumber;
            }
        }

        for(int i=0;i<queries.length;i++){
            if(grp[queries[i][0]]==grp[queries[i][1]])ans[i]=true;
        }
        return ans;
    }
}