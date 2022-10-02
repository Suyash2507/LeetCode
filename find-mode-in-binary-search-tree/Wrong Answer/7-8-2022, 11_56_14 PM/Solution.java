// https://leetcode.com/problems/find-mode-in-binary-search-tree

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
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    public int[] findMode(TreeNode root) {
        traverse(root);
        int ans = Integer.MIN_VALUE, k = 0;
        for (Map.Entry e : hm.entrySet()) {
            if((int)e.getValue()>ans){   ans = (int)e.getValue();    k =(int)e.getKey();}
        }
        return new int[]{k};
    }
    void traverse(TreeNode root){
        if(root==null)  return;
        if(hm.get(root.val)!=null){
            hm.put(root.val,(int)hm.get(root.val)+1);
        }
        else{
            hm.put(root.val,1);
        }
        traverse(root.left);
        traverse(root.right);
    }
}