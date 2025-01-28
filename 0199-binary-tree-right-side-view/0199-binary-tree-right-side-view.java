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
    public void levelorder(TreeNode root ,List<Integer> ans){
        if(root == null){
            return ;
        }
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);
        while(!tree.isEmpty()){
            int len = tree.size();
            for(int i =0; i < len-1; i++){
                TreeNode a = tree.poll();
                if(a.left!=null){
                    tree.add(a.left);
                }
                if(a.right!=null){
                    tree.add(a.right);
                }
            }
            TreeNode a1= tree.poll();
            ans.add(a1.val);
            if(a1.left!=null){
                tree.add(a1.left);
            }
            if(a1.right!=null){
                tree.add(a1.right);
            }
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        levelorder(root, ans);
        return ans;
    }
}