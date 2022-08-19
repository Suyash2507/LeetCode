// https://leetcode.com/problems/add-two-numbers

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
        ListNode temp=new ListNode(0);
        ListNode ans=temp;
        int c=0,n1=0,n2=0,l=0;
        while(l1!=null || l2!=null){
            if(l1==null){
                n1=0;
            }else{
                n1=l1.val;
            }
            if(l2==null){
                n2=0;
            }else{
                n2=l2.val;
            }
            int sum=n1+n2+c;
            c=sum/10;
            l=sum%10;
            ListNode temp2= new ListNode(l);
            ans.next=temp2;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            ans=ans.next;
        }
        if(c>0){
            ListNode temp3= new ListNode(c);
            ans.next=temp3;
            ans=ans.next;
        }
        return temp.next;
    }
}