class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int arr1[]=new int[nums.length];
       
        int n=nums.length;
        
        for(int i=1;i<n;i++){
            arr1[i] = arr1[i - 1];
            if ((nums[i - 1] % 2 == 0 && nums[i] % 2 == 0) || 
                (nums[i - 1] % 2 != 0 && nums[i] % 2 != 0)) {
                arr1[i]++;
            }

        }

        
    boolean ans[]=new boolean[queries.length];
     
    for(int i=0;i<queries.length;i++){
        int a=queries[i][0];
        int b=queries[i][1];

        int s=arr1[b]-(a>0?arr1[a]:0);
        ans[i]=(s==0);
    }
    return ans;
    }
}