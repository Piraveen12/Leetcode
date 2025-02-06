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
    public void levelorder(TreeNode root, List<List<Integer>> result){
        if(root == null){
            return  ;
        }
        Queue<TreeNode >q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int st = 0; st < len;st++ ){
                TreeNode data =q.poll();
                ans.add(data.val);
                if(data.left!=null){
                    q.add(data.left);
                }
                if(data.right!=null){
                    q.add(data.right);
                }
            }
            result.add(new ArrayList(ans));
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelorder(root, result);
        Collections.reverse(result);
        return result;
    }
}