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
    private int count  = 0;
    private void preorder(TreeNode root, int target,long currentval){
        if(root == null){
            return ;
        }
        currentval+=root.val;
        if(currentval == target){
            count++;
        }
        preorder(root.left,target,currentval);
        preorder(root.right,target,currentval);
        return;
    }
    public int pathSum(TreeNode root, int targetSum) {
        Queue<TreeNode > ans = new LinkedList<>();
        if(root == null){
            return 0;
        }
        ans.add(root);
        while(!ans.isEmpty()){
            int len = ans.size();
            for(int i =0;i<len ;i++){
                TreeNode result = ans.poll();
                preorder(result,targetSum,0);
                if(result.left !=null)
                {
                    ans.add(result.left);
                }
                if(result.right!= null){
                    ans.add(result.right);
                }
            }
        }
        return count;
    }
}