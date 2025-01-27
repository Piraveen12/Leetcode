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
    public int preorder(TreeNode root, int level){
        if(root == null){
            return level;
        } 
        int left=preorder(root.left,level+1);
        int right=preorder(root.right,level+1);
        return Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        int level=0;
        int data = preorder(root, level );
        return data;
    }
}