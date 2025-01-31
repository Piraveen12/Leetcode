/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void level(Node root, List<List<Integer>>ans){
        if(root == null){
            return ;
        }
        Queue<Node>result = new LinkedList<>();
        result.add(root);
        while(!result.isEmpty()){
            int len = result.size();
            List<Integer>templist= new ArrayList<>();
            for(int i=0;i < len ;i++){
                Node temp = result.poll();
                templist.add(temp.val);
                for(Node eachnode : temp.children){
                    result.add(eachnode);
                }
            }
            ans.add(new ArrayList(templist));
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        level(root,ans);
        return ans;
    }
}