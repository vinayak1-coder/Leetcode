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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=diameterOfBinaryTree(root.left);
        int r=diameterOfBinaryTree(root.right);
        int s= ht(root.left) + ht(root.right) + 2;
        return (Math.max(l,Math.max(r,s)));
    }
    private int ht(TreeNode root){
        if(root==null){
            return -1;
        }
        int lt=ht(root.left);
        int rt=ht(root.right);
        return Math.max(lt,rt)+1;
    }
}