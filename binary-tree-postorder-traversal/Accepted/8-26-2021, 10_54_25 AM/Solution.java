// https://leetcode.com/problems/binary-tree-postorder-traversal

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
    ArrayList<Integer> ll;
    public List<Integer> postorderTraversal(TreeNode root) {
        ll=new ArrayList<Integer>();
        if(root==null)
            return ll;
		Traverse(root);  
        return ll;
    }
    public void Traverse(TreeNode root) {
        if(root==null)
            return;
        Traverse(root.left);
        Traverse(root.right);
        ll.add(root.val);
    }
}