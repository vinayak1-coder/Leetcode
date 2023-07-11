/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> dist = new ArrayList<Integer>(); 
				// Note : Since target is always in the tree, we can do this.
        if( K == 0){
            dist.add(target.val); 
            return dist; 
        }
        traverse(dist, root, target, K, 0); 
        return dist; 
    }
    public int traverse(List<Integer> dist, TreeNode root, TreeNode target, int k, int val){
        if(root == null) 
            return 0; 
						// val == k implies that we are at the k-th distant child from the target
        if(val == k){
            dist.add(root.val); 
            return 0; 
        }
        int left = 0, right = 0; 
				
				// either we find the target or we have already found the target propagate val+1
        if(root.val == target.val || val > 0 ){
            left = traverse(dist, root.left, target, k, val+1); 
            right = traverse(dist, root.right, target, k, val+1); 
        }
				
				// else propagate the 0
        else {
            left = traverse(dist, root.left, target, k, val); 
            right = traverse(dist, root.right, target, k, val); 
        }
				
				// If a node receives a k in return it is k-th distant parent from the the target.
        if(left == k || right == k){
            dist.add(root.val); 
            return 0; 
        }
				
				// Target node must return 1 other must return 0 if their subtree doesnt have target.
        if(root.val == target.val){
            return 1; 
        }
				
				// If left or right is greater than 0 that means one of the subtree has the target. Propagate the new value in the other subtree. 
        if(left > 0){
            traverse(dist, root.right, target, k, left + 1); 
        }
        if(right > 0){
            traverse(dist, root.left, target, k, right+1); 
        }
				// If the subtree has target, return the distance from target +1 
        if(left > 0 || right > 0)
            return left > 0 ? left + 1 : right + 1; 
						
				// else return 0. 
        return 0; 
    }
}