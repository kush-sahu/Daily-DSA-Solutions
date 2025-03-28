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
     public boolean trav(TreeNode leftT, TreeNode rightT){
       
        if(leftT==null && rightT==null)return true;
        if(leftT==null && rightT!=null)return false;
        if(leftT!=null && rightT==null)return false;
        boolean b=true;
        boolean b1=true;
        if(leftT.val==rightT.val)
        {
            b=b && trav(leftT.left,rightT.right);
        }else if(leftT.val!=rightT.val){
            return false;
        }

        if(leftT.val==rightT.val){
           b1=b1 && trav(leftT.right,rightT.left);
        }else if(leftT.val!=rightT.val){
            return false;
        }
        return b1 && b ;
    } 
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return trav(root.left,root.right);
    }
}