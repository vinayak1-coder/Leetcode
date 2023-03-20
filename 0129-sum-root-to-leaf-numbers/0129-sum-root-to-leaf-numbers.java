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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        //if(root==null) return null;
        int sum1=0;
        dfs(root,sum);
        return sum;
    }
    private void dfs(TreeNode root, int sum1){
        if(root == null) return;
        //int sum1=0;
        if(root.left==null && root.right==null) {
            sum+=sum1*10+root.val;
            return;
        }
        dfs(root.left,sum1*10+root.val);
        dfs(root.right,sum1*10+root.val);
    }
}