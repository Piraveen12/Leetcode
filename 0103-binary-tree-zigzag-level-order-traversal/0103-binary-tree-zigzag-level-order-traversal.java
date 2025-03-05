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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode > result = new  LinkedList<>();
        if(root == null){
            return ans;
        }
        result.add(root);
        int count = 0;
        while(!result.isEmpty()){
            int len = result.size();
            List<Integer> t1 = new ArrayList<>();
            for(int index =  0 ; index < len ; index++){
                TreeNode tempnode = result.poll();
                t1.add(tempnode.val);
                if(tempnode.left!=null) result.add(tempnode.left);
                if(tempnode.right!=null) result.add(tempnode.right); 
            }
            if(count % 2 == 0){
                ans.add(new ArrayList(t1));
            }
            else{
                Collections.reverse(t1);
                ans.add(new ArrayList(t1));
            }
            count++;
        }
        return ans;
    }
}