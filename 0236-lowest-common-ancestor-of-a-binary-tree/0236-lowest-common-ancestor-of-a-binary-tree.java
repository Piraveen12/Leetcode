/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode preorder(TreeNode root,TreeNode p , TreeNode q){
        if(root== null){
            return null;
        }
        if(root == p){
            return root;
        }
         
         if(root == q){
            return q;
         }
        TreeNode left = preorder(root.left , p, q);
        TreeNode right = preorder(root.right , p, q);

        if(left!= null && right != null){
            return root;
        }
        return left==null? right: left;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = preorder(root,p ,q);
        return result;
    }
}