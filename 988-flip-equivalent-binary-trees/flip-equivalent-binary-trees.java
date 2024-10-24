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
// class Solution {
//     public boolean flipEquiv(TreeNode root1, TreeNode root2) {
//         Queue<TreeNode>q1=new LinkedList<>();
//         Queue<TreeNode>q2=new LinkedList<>();
//         if(root1==null && root2==null)return true;
//         if(root1==null && root2!=null)return false;
//         if(root1!=null && root2==null)return false;
//         q1.add(root1);
//         q2.add(root2);

//         while(q1.size()>0){
//             TreeNode node1=q1.remove();
//             TreeNode node2=q2.remove();

//             if(node1.left!=null){
//                 q1.add(node1.left);
//             }
//             if(node1.right!=null){
//                 q1.add(node1.right);
//             }

//             if(node1.left == node2.left){
//                 if(node2.left!=null){
//                 q2.add(node1.left);
//                 }
//             }else if(node1.left == node2.right){
//                 if(node2.left!=null){
//                 q2.add(node1.left);
//                 }
//             }else return false;


//             if(node1.right == node2.left){
//                 if(node1.left!=null){
//                 q2.add(node1.right);
//                 }
//             }else if(node1.left == node2.right){
//                 if(node2.left!=null){
//                 q2.add(node1.right);
//                 }
//             }else return false;
//         }
//         return true;
//     }
// }

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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        
           if(root1==null && root2==null)return true;
           if(root1==null || root2==null)return false;
           if(root1.val!=root2.val)return false;


        return flipEquiv(root1.left ,root2.left) && flipEquiv(root1.right,root2.right) || flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left);
    }
}