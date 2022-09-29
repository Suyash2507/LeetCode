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
    public int v=0;
    public int sum=0;
    public int maxlevel=-1;
    public int deepestLeavesSum(TreeNode root) {
        traverse(root,0);
        return sum;
        
    }
    public void traverse(TreeNode node, int level){
        if(node==null)
            return;
        traverse(node.left,level+1);
        traverse(node.right,level+1);
        if(level>=maxlevel){
            sum=sum+node.val;
            maxlevel=level;
        }
    }   
}