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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        boolean ans= helper(root, targetSum, sum);
        return ans;
    }

    public boolean helper(TreeNode root, int targetSum, int sum){
        if(root==null)return false;
        sum=sum+root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum)return true;
            else{
                return false;
            }
        }
        boolean leftans= helper(root.left, targetSum, sum);
        boolean rightans= helper(root.right, targetSum, sum);
        return leftans||rightans;
    }
}
