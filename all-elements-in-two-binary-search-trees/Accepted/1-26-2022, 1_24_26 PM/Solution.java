// https://leetcode.com/problems/all-elements-in-two-binary-search-trees

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
    List<Integer> al;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        al=new ArrayList();
        traverse(root1);
        traverse(root2);
        Collections.sort(al);
        return al;
    }
    public void traverse(TreeNode tr){
        if(tr==null)
            return;
        al.add(tr.val);
        traverse(tr.left);
        traverse(tr.right);
    }
}