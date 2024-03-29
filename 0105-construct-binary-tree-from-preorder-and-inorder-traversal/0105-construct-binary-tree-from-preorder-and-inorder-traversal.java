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
   //private int preStart = 0;
    Map<Integer,Integer> map = new HashMap<>();
public TreeNode buildTree(int[] preorder, int[] inorder) {
    for(int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
       return newTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    private TreeNode newTree(int[] preorder, int[] inorder, int pstart,int pend, int istart,int iend){
        if(pstart==pend){
            return new TreeNode(preorder[pstart]);
        }
        if(pstart > pend) return null;
        int idx = map.get(preorder[pstart]);
        TreeNode root = new TreeNode(inorder[idx]);
        root.left=newTree(preorder,inorder,pstart + 1, pstart + idx - istart,istart, idx - 1);
        root.right=newTree(preorder,inorder,pstart + idx - istart + 1,pend, idx + 1, iend);
        return root;
    }
}