/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int good(TreeNode root,int ans,int max) {
        if(root.left==null && root.right==null)return ans;
      
        int left=0;
        if(root.left!=null && (root.left.val>=max))
        left= good(root.left,ans+1,Math.max(max,root.left.val));
        else if(root.left!=null) left=good(root.left,ans,Math.max(max,root.left.val));

        int right=0;
        if(root.right!=null && (root.right.val>=max))
        right= good(root.right,ans+1,Math.max(max,root.right.val));
        else if(root.right!=null)right=good(root.right,ans,Math.max(max,root.right.val));

        if(left>0 && right>0)
        return left+right-ans;
        else return left+right;
    }
    public int goodNodes(TreeNode root) {
        
        return good(root,0,root.val)+1;     
        
    }
}