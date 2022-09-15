// https://leetcode.com/problems/count-complete-tree-nodes

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
    int v=0;
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        findnode(root);
        return v;
    }
    public void findnode(TreeNode root){
        if(root!=null){
            v++;
            findnode(root.left);
            findnode(root.right);
        }
    }
}