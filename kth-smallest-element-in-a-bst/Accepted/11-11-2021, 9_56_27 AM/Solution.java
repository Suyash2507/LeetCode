// https://leetcode.com/problems/kth-smallest-element-in-a-bst

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
    ArrayList<Integer> al;
    public int kthSmallest(TreeNode root, int k) {
        al= new ArrayList<Integer>();
        traverse(root);
        Collections.sort(al);
        return (int)al.get(k-1);
    }
    void traverse(TreeNode root){
        if(root==null)
            return ;
        al.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}