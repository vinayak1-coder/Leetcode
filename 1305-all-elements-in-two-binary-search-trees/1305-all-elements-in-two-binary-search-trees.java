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
    List<Integer> ans= new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        inOrder(root1,list1);
        inOrder(root2,list2);
        merge(list1,list2);
        return ans;
    }
    private void inOrder(TreeNode root, List<Integer> arr){
        if(root==null){
            return;
        }
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }
    public void merge(List<Integer> list1 , List<Integer> list2){
        //List<Integer> ans= new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i)<=list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }
            else{
                ans.add(list2.get(j));
                j++;
            }   
        }
        if(i!=list1.size()){
            for(int k=i;k<list1.size();k++){
                ans.add(list1.get(k));
            }
        }
        if(j!=list2.size()){
            for(int k=j;k<list2.size();k++){
                ans.add(list2.get(k));
            }
        }
    }
    
}