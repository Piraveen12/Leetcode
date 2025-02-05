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
    public void dfs(TreeNode root, List<String>result ,StringBuilder ans){
        if(root == null){
            return ;
        }
        int len = ans.length();
        if(root.left == null && root.right==null){
            ans.append(root.val);
            result.add(new String(ans));
           
        }
        if(root.left != null || root.right !=null){
            ans.append(root.val+"->");
            dfs(root.left, result, ans);
            dfs(root.right,result,ans);
             
        }
        ans.setLength(len);
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result  =new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        dfs(root,result,ans); 
        return result;
    }
}