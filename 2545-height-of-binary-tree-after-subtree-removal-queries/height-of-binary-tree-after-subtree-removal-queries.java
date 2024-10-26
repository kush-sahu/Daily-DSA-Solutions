// /** 
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */


//This is correct approch but not optimal
// class Solution {
//     public int height(TreeNode root,int q){
//         if(root==null)return -1;
//         if(root.val==q)return -1;
//         if(root.left==null && root.right==null)return 0;

//         int x=1+height(root.left,q);
//         int y=1+height(root.right,q);

//         return Math.max(x,y);
//     }
//     public int[] treeQueries(TreeNode root, int[] queries) {
//         int ans[]=new int[queries.length];
//         for(int i=0;i<ans.length;i++){
//             int a=height(root, queries[i]);
//             ans[i]=a;
//         }
//         return ans;
//     }
// } 


//This is 2nd approch 



class Solution {
    int level[]=new int[1000001];
    int height[]=new int[1000001];
    int max1sth[]=new int[1000001];
    int max2ndh[]=new int[1000001];

    public int helper(TreeNode root, int l){

        if(root==null)return 0;
         level[root.val]=l;

        height[root.val]=(Math.max(helper(root.left, l+1),helper(root.right,l+1))+1);

        if(max1sth[l]<height[root.val]){
            max2ndh[l]=max1sth[l];
            max1sth[l]=height[root.val];
        }else if(max2ndh[l]<height[root.val]){
            max2ndh[l]=height[root.val];
        }

        return height[root.val];


    }
    public int[] treeQueries(TreeNode root, int[] queries) {
        helper(root,0);
        int ans[]=new int[queries.length];
       
       for(int i=0;i<queries.length;i++){
           int ele=queries[i];
            int L=level[ele];
           // ans=L+ max-
            int result=L +(max1sth[L]==height[ele] ? max2ndh[L] : max1sth[L])-1;
            ans[i]=result;
       }


        return ans;
    }
} 