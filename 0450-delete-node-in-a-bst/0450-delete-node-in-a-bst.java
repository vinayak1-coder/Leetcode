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
    public TreeNode deleteNode(TreeNode root, int key) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,list, key);
        return conv(list, 0, list.size() - 1);
    }
    private void inOrder(TreeNode root, List<Integer> list, int key){
        if(root == null) return;
        inOrder(root.left,list, key);
        if(root.val != key)
        list.add(root.val);
        inOrder(root.right,list, key);
    }
    private TreeNode conv(List<Integer> list,int start, int end){
        if(start > end) return null;
        int mid=(start+end)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = conv(list,start,mid-1);
        root.right = conv(list,mid+1, end);
        return root;
    }
}