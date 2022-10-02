// https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree

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
    TreeNode n;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traverse(original,cloned,target);
        return n;
    }
    public void traverse(TreeNode t1,TreeNode t2,TreeNode valu){
        if(t1==null)
            return;
        traverse(t1.left,t2.left,valu);
        if(t1.val==valu.val)
            n=t2;
        traverse(t1.right,t2.right,valu);
    }
    
}