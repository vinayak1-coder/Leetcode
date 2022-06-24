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
public List<TreeNode> generateTrees(int n) {
    return n > 0 ? helper(1, n) : new ArrayList<TreeNode>();
}

private List<TreeNode> helper(int from, int n) {
	List<TreeNode> trees = new ArrayList<TreeNode>();
	for (int i = 0; i <= n - 1; ++i) {
		//left i, right n-1-i
		List<TreeNode> leftList = helper(from, i);
		List<TreeNode> rightList = helper(from + i + 1, n - 1 - i);
		for (TreeNode left : leftList)
			for (TreeNode right : rightList) {
				TreeNode root = new TreeNode(from + i);
				root.left = left;
				root.right = right;
				trees.add(root);
			}
	}
	if (trees.size() == 0)
		trees.add(null);
	return trees;
}
}