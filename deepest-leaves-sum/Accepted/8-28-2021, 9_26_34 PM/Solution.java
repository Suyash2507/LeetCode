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
        findMax(root,0);
        traverse(root,0,maxlevel);
        return sum;     
    }
    public void findMax(TreeNode node, int level){
        if(node==null)
            return;
        findMax(node.left,level+1);
        findMax(node.right,level+1);
        if(level>=maxlevel)
            maxlevel=level;
    }
    public void traverse(TreeNode node, int level, int maxlevel){
        if(node==null)
            return;
        traverse(node.left,level+1, maxlevel);
        traverse(node.right,level+1, maxlevel);
        if(level==maxlevel && node.left==null && node.right==null){
            sum=sum+node.val;
            maxlevel=level;
        }
    }   
}