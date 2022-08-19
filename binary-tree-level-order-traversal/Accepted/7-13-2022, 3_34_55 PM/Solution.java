// https://leetcode.com/problems/binary-tree-level-order-traversal

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
    List<List<Integer>> sol = new ArrayList<>();
    HashMap<Integer,List<Integer>> hm = new HashMap<Integer,List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        check(root,1);
        for(Map.Entry<Integer, List<Integer>> e : hm.entrySet()){
            List<Integer> tt = e.getValue();
            sol.add(tt);
        }
        return sol;
    }
    void check(TreeNode root, int level){
        if(root==null)  return;
        else{
            if(hm.containsKey(level)){
                List<Integer> t = hm.get(level);
                t.add(root.val);
                hm.put(level, t);
            }else   hm.put(level, new ArrayList<>(Arrays.asList(root.val)));
            check(root.left,1+level);
            check(root.right,1+level);
        }
    }
}