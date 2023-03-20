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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return newTree(inorder,postorder,0,postorder.length-1,0,inorder.length-1);
    }
    private TreeNode newTree(int[] inorder,int[] postorder,int postart,int poend,int instart,int inend){
        if(poend==postart){
            return new TreeNode(postorder[postart]);
        }
        if(postart>poend) return null;
        int idx=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==postorder[poend]){
                idx=i;
                break;
            }
        }
        TreeNode root=new TreeNode(inorder[idx]);
        root.left = newTree(inorder, postorder, postart, poend - (inend - idx) - 1, instart, idx - 1);
        root.right = newTree(inorder, postorder, poend - (inend - idx), poend - 1, idx + 1, inend);
        return root;
    }
}