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
        if(root == null){
            return "#";
        }
      StringBuilder  result= new StringBuilder();
      Queue <TreeNode > ans = new LinkedList<>();
      ans.add(root);
       while(!ans.isEmpty()){
        int length=ans.size();
        for(int st= 0; st < length ;st++){
            TreeNode temp = ans.poll();
        
            if(temp != null){
                result.append(temp.val+"$");
                ans.add(temp.left);
                ans.add(temp.right);
            }
            else if(temp== null)
                result.append("#$");
        }
       }
       return result.toString();  
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() < 1 || data.equals("#") ){
            return null;
        }
        String [] result = data.split("\\$");
        if(result[0].equals("#")){
            return null;
        }
        
        Queue <TreeNode> ans = new LinkedList<>();
        TreeNode root= new TreeNode(Integer.parseInt(result[0]));
        ans.add(root);
        int length= result.length;
        for(int st = 1; st < length; st++){
            TreeNode temp = ans.poll();
            if(!result[st].equals("#")){
                TreeNode left= new TreeNode (Integer.parseInt(result[st]));
                temp.left=left;
                ans.add(left);
            }
            if(++st < length &&!result[st].equals("#")){
                TreeNode right = new TreeNode (Integer.parseInt(result[st]));
                temp.right=right;
                ans.add(right);
            }
        }
    
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));