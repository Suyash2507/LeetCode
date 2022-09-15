// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal

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
    int index;
    Map<Integer, Integer> hm;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = inorder.length-1;
        hm = new HashMap<>();
        for(int i=0;i<inorder.length;++i) {
            hm.put(inorder[i], i);
        }
        return tree(postorder, 0, postorder.length-1);
    }
    TreeNode tree(int[] postorder, int left, int right) {
        if(left>right) return null;
        int val = postorder[index--];
        TreeNode root = new TreeNode(val);
        root.right = tree(postorder, hm.get(val)+1, right);
        root.left = tree(postorder, left, hm.get(val)-1);
        return root;
    }
}