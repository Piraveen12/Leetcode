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
    int ans = 0;
    private void preorder(TreeNode root,int sum){
        if(root == null){
            return ;
        }
        sum = sum*10+root.val;
        if(root.left == null && root.right == null){
            ans += sum;
            return ;
        }
        preorder(root.left,sum);
        preorder(root.right,sum);
       return ;
    }
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return ans;
        }
        preorder(root,0);
        return ans;
    }
}