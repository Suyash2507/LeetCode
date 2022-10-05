// https://leetcode.com/problems/increasing-order-search-tree

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
    TreeNode temp;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        TreeNode curr = new TreeNode(0);
		temp= curr;
		Traverse(root);
        return curr.right;
    }
    public void Traverse(TreeNode root) {
        if(root==null)
            return;
        Traverse(root.left);
        temp.right = new TreeNode(root.val);
        temp=temp.right;
        Traverse(root.right);
    }
}