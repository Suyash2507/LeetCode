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
    int max;
    public int[] findMode(TreeNode root) {
        max = 0;
        traverse(root);
        int ans = Integer.MIN_VALUE, k = 0;
        List<Integer> al = new ArrayList();
        for (Map.Entry e : hm.entrySet()) {
            if((int)e.getValue()==max)  al.add((int)e.getKey());
        }
        int[] sol = new int[al.size()];
        for(int x=0;x<al.size();x++)    sol[k++] = (int)al.get(x);
        //System.out.println(max);
        return sol;
    }
    void traverse(TreeNode root){
        if(root==null)  return;
        if(hm.containsKey(root.val)){
            hm.put(root.val,(int)hm.get(root.val)+1);
            max = Math.max(max, (int)hm.get(root.val));
        }
        else{
            hm.put(root.val,1);
        }
        traverse(root.left);
        traverse(root.right);
    }
}