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
        ArrayList<Integer> a= new ArrayList<>();
        helper(root, k, a);
        return a.get(k-1);
    }
    public void helper(TreeNode root, int k, ArrayList<Integer> a){
        if(root==null)return;
        helper(root.left, k, a);
        a.add(root.val);
        helper(root.right, k, a);
        
    }
}
