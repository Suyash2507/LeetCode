// https://leetcode.com/problems/add-two-numbers-ii

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sol=new ListNode(0);
        ListNode ans = sol;
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        while(l1!=null){
            a1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            a2.add(l2.val);
            l2=l2.next;
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        Collections.reverse(a1); Collections.reverse(a2);
        int carry=0;
        for(int i=0,j=0;(i<a1.size() || j<a2.size());i++,j++){
            int a = i<a1.size()?(int)a1.get(i):0;
            int b = j<a2.size()?(int)a2.get(j):0;
            al.add(((a+b+carry)%10));
            carry= (a+b+carry)/10;
        }
        if(carry!=0){
            al.add(carry);
        }
        Collections.reverse(al);
        for(int q=0;q<al.size();q++){
            sol.next=new ListNode((int)al.get(q));
            sol=sol.next;
        }
        return ans.next;
    }
}