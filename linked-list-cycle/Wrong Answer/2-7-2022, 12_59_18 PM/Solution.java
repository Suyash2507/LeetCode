// https://leetcode.com/problems/linked-list-cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(head!=null){
            if(!al.contains(head.val)){
                al.add(head.val);
            }
            else{
                return true;
            }
            head=head.next;
        }
        return false;
    }
}