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
    public int kthSmallest(TreeNode root, int k) {
//         List<Integer> list=new ArrayList<>();
//         Stack<TreeNode> stack=new Stack<>();
//         TreeNode curr=root;
//         while(curr != null || !stack.isEmpty()){
//             while(curr != null){
//                 stack.push(curr);
//                 curr=curr.left;
//             }
//             curr=stack.pop();
//             list.add(curr.val);
//             curr=curr.right;
//         }
        
//             int temp=list.get(k-1);
        
//         return temp;
        List<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        return arr.get(k - 1);
    }
    private void inOrder(TreeNode root,List<Integer> arr) {
        if(root == null) return;
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
    }
}