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
    public boolean preorder(TreeNode root , int sum ){
        
        if(root == null){
            return false;
        }
        sum=sum-root.val;
        if((root.left == null && root.right == null) && sum==0){
            return true;
        }
        boolean left =preorder(root.left, sum );
         
        boolean right= preorder(root.right,sum );
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return preorder(root, targetSum);
    }
}