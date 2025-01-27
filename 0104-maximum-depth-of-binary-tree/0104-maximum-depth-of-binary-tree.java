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
    public int levelorder(TreeNode root, int level){
        if(root== null){
            return 0;
        }
        Queue <TreeNode > tree = new LinkedList<>();
        tree.add(root);
        while(!tree.isEmpty()){
            int len = tree.size();
            for(int index= 0 ;index < len ;index ++){
                TreeNode temp1= tree.poll();
                if(temp1.left!=null)
                    tree.add(temp1.left);
                if(temp1.right!=null)
                    tree.add(temp1.right);
            }
            level++;
            
        }
        return level;
    }
    public int maxDepth(TreeNode root) {
        int level=0;
        int data = levelorder(root, level );
        return data;
    }
}