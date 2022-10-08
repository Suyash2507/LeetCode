// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans=new TreeNode(0);
        traverse(root,p,q,ans);
        return ans.left;
    }
    void traverse(TreeNode root, TreeNode p, TreeNode q,TreeNode ans){
        if(root==null)  return ;
        if(root.left==p && root.right==q){
            ans.left=new TreeNode(root.val);
        }
        traverse(root.left,p,q,ans);
        traverse(root.right,p,q,ans);
    }
}