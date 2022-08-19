// https://leetcode.com/problems/binary-search-tree-iterator

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
class BSTIterator {
    TreeNode node;
    List<Integer> al;
    int z = 0;
    void getValues(TreeNode node){
        if(node==null)  return;
        al.add(node.val);
        getValues(node.left);
        getValues(node.right);
    }
    public BSTIterator(TreeNode root) {
        node = root;
        al = new ArrayList();
        getValues(root);
        Collections.sort(al);
    }
    public int next() {
        int k = (int)al.get(z++);
        return k;
    }
    
    public boolean hasNext() {
        return z==al.size() ? false : true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */