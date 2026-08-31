// Last updated: 8/31/2026, 9:55:05 AM
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
    private int dc=0;
    public int countDominantNodes(TreeNode root) {
        dc=0;
        helper(root);
        return dc;
        }
        private int helper(TreeNode node){
            if(node==null){
            return Integer.MIN_VALUE;
            }
        int l=helper(node.left);
        int r=helper(node.right);
            int currentSubtreeMax=Math.max(node.val,Math.max(l,r));
        if(node.val==currentSubtreeMax){
            dc++;
        }
        return currentSubtreeMax;
    }
}