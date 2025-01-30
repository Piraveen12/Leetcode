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
    public void preorder(TreeNode root, int targetSum , List<List<Integer>> result, List<Integer> ans){
        if(root == null){
            return ;
        }
        targetSum=targetSum-root.val;
        ans.add(root.val);
        if(targetSum == 0 && root.left == null && root.right == null){
            result.add(new ArrayList(ans));
           
        }
         else{
            preorder(root.left, targetSum, result,ans);
            preorder(root.right,targetSum,result,ans);
         }
         ans.remove(ans.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> result= new ArrayList<>();
        preorder(root, targetSum, ans,result);
        return ans;
    }
}