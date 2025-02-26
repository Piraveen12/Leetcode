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
        if(root != null && root.left==null && root.right == null){
            System.out.println(level);
            return level;
        }
        int left = 0;
        int right = 0;
        if(root.left != null){
            left = preorder(root.left, level+1);
        }
        if(root.right != null){
            right = preorder(root.right,level+1);
        }
        level = level -1;
        if(left == 0 && right != 0){
            return right;
        }
        else if(left != 0 && right ==0){
            return left;
        }
        else
        return Math.min(left,right);
    }
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int level=0;
        int data = preorder(root, level);
        return data+1;
    }
}