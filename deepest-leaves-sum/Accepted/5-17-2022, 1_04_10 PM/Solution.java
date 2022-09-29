// https://leetcode.com/problems/deepest-leaves-sum

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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        int findmaxl= traverse(root);
        traverse2(root, findmaxl , 1);
        return sum;
    }
    void traverse2(TreeNode root, int n, int k){
        if(root==null)  return ;
        if(k==n)    sum=sum+root.val;
        traverse2(root.left,n,k+1);
        traverse2(root.right,n,k+1);
    }
    int traverse(TreeNode root){
        if(root==null)  return 0;
        return Math.max(1+traverse(root.left),1+traverse(root.right));
    }
    
}