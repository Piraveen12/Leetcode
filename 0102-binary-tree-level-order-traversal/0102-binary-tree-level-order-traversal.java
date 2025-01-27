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
    public void level(TreeNode root , List<List<Integer>> ans){
        if(root==null){
            return ;
        }
        Queue <TreeNode> tree= new LinkedList<>();
        tree.add(root);
        while(!tree.isEmpty()){
            List<Integer>temp = new ArrayList<>();
            int len= tree.size();
            for(int index =  0 ; index < len ; index++){
                TreeNode tempnode = tree.poll();
                temp.add(tempnode.val);
                if(tempnode.left!=null) tree.add(tempnode.left);
                if(tempnode.right!=null) tree.add(tempnode.right); 
            }
            ans.add(new ArrayList(temp));
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans =new ArrayList<>();
        level(root,ans);
        return ans;
    }
}