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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root.val==p.val || root.val==q.val)return root;

    
        TreeNode leftNode=lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode=lowestCommonAncestor(root.right,p,q);
        if(leftNode!=null && rightNode==null)return leftNode;
        if(leftNode!=null && rightNode!=null)return root;
        if(leftNode==null && rightNode!=null)return rightNode;
        return null;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null)return root;
        ArrayList<TreeNode>list=new ArrayList<>();

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            list=new ArrayList<>();
            int m=q.size();
            for(int i=0;i<m;i++){
                TreeNode n=q.poll();
                list.add(n);
                if(n.left!=null)q.add(n.left);
                if(n.right!=null)q.add(n.right);
            }
        }
        return lowestCommonAncestor( root,  list.get(0), list.get(list.size()-1));
    }
}