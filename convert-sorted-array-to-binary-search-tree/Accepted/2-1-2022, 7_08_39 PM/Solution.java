// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree

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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)  return null;
        return tree(nums,0,nums.length-1);
    }
    public TreeNode tree(int[] nums,int l,int h){
        if(l>h){
            return null;
        }
        int m=(l+h)/2;
        TreeNode head=new TreeNode(nums[m]);
        head.left= tree(nums,l,m-1);
        head.right= tree(nums,m+1,h);
        return head;
    }
}