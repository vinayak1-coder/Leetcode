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
    String str="~";
    public String smallestFromLeaf(TreeNode root) {
        return newt(root,"");
    }
    private String newt(TreeNode root, String st){
        if(root==null) return  st;
        st=(char)(root.val+'a')+st;
        if(root.left == null && root.right == null && str.compareTo(st)>0) {
            str=st;
        }
        newt(root.left,st);
        newt(root.right,st);
        return str;
    }
}