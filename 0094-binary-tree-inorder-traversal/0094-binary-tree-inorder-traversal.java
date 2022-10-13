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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addlist(list,root);
        return list;
    }
    public void addlist(List<Integer> list, TreeNode root){
        if(root==null){
            return;
        }
        addlist(list,root.left);
        list.add(root.val);
        addlist(list,root.right);
    }
}