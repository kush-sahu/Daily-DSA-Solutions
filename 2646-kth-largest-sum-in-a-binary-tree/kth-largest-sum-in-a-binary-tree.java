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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode>q=new LinkedList<>();
        PriorityQueue<Long>pq=new PriorityQueue<>(Collections.reverseOrder());
        if(root==null)return -1;
        q.add(root);

        while(q.size()>0){
            int n=q.size();
            long sum=0;
            for(int i=0;i<n;i++){
                TreeNode node=q.remove();
                sum+=node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            pq.add(sum);
        }
        if(pq.size()<k)return -1;
        long ans=0;
        for(int j=1;j<=k;j++){
            if(j==k){
                ans =pq.poll();
            }
            pq.poll();
        }
        return ans;
    }
}