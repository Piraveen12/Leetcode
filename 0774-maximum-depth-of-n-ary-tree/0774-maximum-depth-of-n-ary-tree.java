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
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int count = 0;
        Queue<Node> ans = new LinkedList<>();
        ans.add(root);
        while(!ans.isEmpty()){
            int len = ans.size();
            for(int st = 0;st< len ;st++){
                Node temp = ans.poll();
                System.out.println(temp.val);
                for(Node val : temp.children){
                    ans.add(val);
                }
            }
            count++;
        }
        return count;
    }
}