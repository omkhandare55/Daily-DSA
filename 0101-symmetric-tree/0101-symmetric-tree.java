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
    public boolean solve(TreeNode L, TreeNode R) {
        if (L == null && R == null)
            return true;
        if (L == null || R == null)
            return false;
        if (L.val != R.val)
            return false;
        return solve(L.left, R.right) && solve(L.right, R.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;
        boolean temp = solve(root.left, root.right);
        return(temp);
    }
}
