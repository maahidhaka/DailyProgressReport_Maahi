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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans= new ArrayList<>();
        helper(root, targetSum, 0, ans, new ArrayList<>());
        return ans;
    }
    
    public void helper(TreeNode root, int targetSum, int sum, List<List<Integer>> ans, List<Integer> path){
        if(root==null)return;

        sum+=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && targetSum==sum){
            ans.add(new ArrayList<>(path));
        }else{
            helper(root.left, targetSum, sum, ans, path);
            helper(root.right, targetSum, sum, ans, path); 
        }
        path.remove(path.size()-1);
    }
}
