// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list

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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        if(head==null)  return null;
        if(head.next==null) return null;
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        ListNode sol=new ListNode(0);
        ListNode temp=sol;
        for(int i=0;i<al.size();i++){
            if(i!=(al.size()/2)){
                sol.next= new ListNode((int)al.get(i));    
                sol=sol.next;
            }
        }
        return temp.next;
    }
}