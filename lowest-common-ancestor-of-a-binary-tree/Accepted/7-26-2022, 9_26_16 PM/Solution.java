// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree

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
    //TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)   return root;
        return left != null ? left : right;
        /*traverse(root,p,q);
        return ans;
    }
    boolean traverse(TreeNode node, TreeNode p, TreeNode q){
        if(node==null)  return false;
        boolean first = node==p || node==q;
        if((traverse(node.left,p,q) && first) || (traverse(node.right,p,q) && first) || (traverse(node.left,p,q) && traverse(node.right,p,q))) ans = node;
        return first || traverse(node.left,p,q) || traverse(node.right,p,q);
    */
    }
}