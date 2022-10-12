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
    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> list=new LinkedList<Integer>();
        Stack<TreeNode> right = new Stack<TreeNode>();
        while(node !=null){
            list.add(node.val);
            if(node.right!=null){
                right.push(node.right);
            }
               if(node.left==null && !right.isEmpty()){
                   node=right.pop();
               }
               else{
                   node=node.left;
               }
        }
        return list;
    }
}