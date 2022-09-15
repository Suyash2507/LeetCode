// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        if(al.size()==0)    return null;
        int[] num=new int[al.size()];
        for(int i=0;i<al.size();i++){
            num[i]= (int)al.get(i);
        }
        Arrays.sort(num);
        return tree(num,0,num.length-1);
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