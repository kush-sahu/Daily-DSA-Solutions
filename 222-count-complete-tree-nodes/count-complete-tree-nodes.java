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
    int c=0;
    public int countNodes(TreeNode root) {
        
        if(root==null)return 0;
        c++;
        if(root.left!=null)countNodes(root.left);
        if(root.right!=null)countNodes(root.right);

        return c;
         
    }
}