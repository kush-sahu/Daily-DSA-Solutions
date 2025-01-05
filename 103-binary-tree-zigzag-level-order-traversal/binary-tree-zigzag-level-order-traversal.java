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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode>st1=new Stack<>();
        Stack<TreeNode>st2=new Stack<>();
        List<List<Integer>>list=new ArrayList<>();
        boolean flag=false;
        if(root==null)return new ArrayList<>();
        st1.push(root);
        while( st1.size()>0){
            int size=st1.size();
            List<Integer>l=new ArrayList<>();
           for(int i=0;i<size;i++){
               TreeNode n=st1.pop();
               l.add(n.val);
                 if(flag==false){
                    if(n.left!=null)st2.push(n.left);
                    if(n.right!=null)st2.push(n.right);
                }else{
                    if(n.right!=null)st2.push(n.right);
                    if(n.left!=null)st2.push(n.left);
                }

            }
            list.add(l);
           flag=!flag;
            Stack<TreeNode>temp=st1;
            st1=st2;
            st2=temp;
        }
        return list;
    }
}