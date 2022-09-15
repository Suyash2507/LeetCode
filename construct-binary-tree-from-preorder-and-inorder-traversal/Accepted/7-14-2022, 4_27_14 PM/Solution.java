// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        hm = new HashMap<>();
        for(int i=0;i<inorder.length;++i) {
            hm.put(inorder[i], i);
        }
        return tree(preorder, 0, preorder.length-1);
    }
    TreeNode tree(int[] preorder, int left, int right) {
        if(left>right) return null;
        int val = preorder[index++];
        TreeNode root = new TreeNode(val);
        root.left = tree(preorder, left, hm.get(val)-1);
        root.right = tree(preorder, hm.get(val)+1, right);
        return root;
    }
}