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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        return dfs(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        //return count;
    }
    private int dfs(TreeNode root,long tsum){
        if(root==null) return 0;
        return (root.val == tsum ? 1 : 0) 
        +dfs(root.left,tsum-root.val)
        // if(tsum-root.val==0){
        //     count++;
        // }
        +dfs(root.right,tsum-root.val);
        // if(tsum==0){
        //     count++;
        // }
        // else{
        //      dfs(root.left,tsum-root.val);
        //      dfs(root.right,tsum-root.val);
        // }
    }
}