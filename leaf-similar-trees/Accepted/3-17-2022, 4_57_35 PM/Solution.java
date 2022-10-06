// https://leetcode.com/problems/leaf-similar-trees

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
    ArrayList<Integer> al1=new ArrayList<Integer>();
    ArrayList<Integer> al2=new ArrayList<Integer>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverse1(root1);
        traverse2(root2);
        return al1.equals(al2);
    }
    void traverse1(TreeNode head){
        if(head==null)  return;
        if(head.left==null && head.right==null){
            al1.add(head.val);
        }
        traverse1(head.left);
        traverse1(head.right);
    }
    void traverse2(TreeNode head){
        if(head==null)  return;
        if(head.left==null && head.right==null){
            al2.add(head.val);
        }
        traverse2(head.left);
        traverse2(head.right);
    }
}