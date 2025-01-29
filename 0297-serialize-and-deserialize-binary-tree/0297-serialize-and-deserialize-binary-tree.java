/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       StringBuilder result = new StringBuilder();
       Queue<TreeNode > ans= new LinkedList<>();

        ans.add(root);
        while(!ans.isEmpty()){
            TreeNode temp =ans.poll();
            if(temp == null){
                result.append("#$");
            } 
            else{
                result.append(temp.val).append("$");
                ans.add(temp.left);
                ans.add(temp.right);
            }
        }
        return result.toString(); 
    }

    public TreeNode deserialize(String data) {
      if(data.equals("")|| data.equals("#")){
        return null;
      }          
      String [] nodes= data.split("\\$");
       
      Queue<TreeNode>result = new LinkedList<>();
      if (nodes[0].equals("#")) return null; 
      TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
      result.add(root);

      for(int st = 1; st < nodes.length; st++){
        TreeNode temp = result.poll();
        if(!nodes[st].equals("#")){
            TreeNode left = new TreeNode(Integer.parseInt(nodes[st]));
            temp.left=left;
            result.add(left);
        }
        if(++st < nodes.length && !nodes[st].equals("#")){
            TreeNode right = new TreeNode(Integer.parseInt(nodes[st]));
            temp.right=right;
            result.add(right);
        }
      }
      return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));