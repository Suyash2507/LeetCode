// https://leetcode.com/problems/binary-tree-right-side-view

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
    List<Integer> sol;
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        sol = new ArrayList<>();
        if(root==null)  return sol;
        dfs(root,1);
        for(Map.Entry e : hm.entrySet()){
            sol.add((int)e.getValue());
        }
        return sol;
    }
    void dfs(TreeNode root,int level){
        if(root==null)  return ;
        else{
            hm.put(level, root.val);
            dfs(root.left, 1+level);
            dfs(root.right, 1+level);
        }
    }
}