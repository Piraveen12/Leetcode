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
    int maxsum = Integer.MIN_VALUE;
    public int postorder(TreeNode root ){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,postorder(root.left ));
        int right=Math.max(0, postorder(root.right ));
        int sum=left+right+root.val;
    
        maxsum=Math.max(sum,maxsum);
        return root.val+Math.max(left,right);
        
    }
    public int maxPathSum(TreeNode root){
        postorder(root );
        return maxsum;
    }
}