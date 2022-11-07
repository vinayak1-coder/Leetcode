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
        if(root==null){
            return "x";
        }
        String leftse=serialize(root.left);
        String rightse=serialize(root.right);
        return root.val + " ," + leftse + ","+rightse;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> que = new LinkedList<>();
        que.addAll(Arrays.asList(data.split(",")));
        return de(que);
    }
    public TreeNode de(Queue<String> que){
        String valuefornode=que.poll();
        if(valuefornode.equals("x")) return null;
        TreeNode newnode=new TreeNode(Integer.valueOf(valuefornode.split(" ")[0]));
        newnode.left=de(que);
        newnode.right= de(que);
        return newnode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));