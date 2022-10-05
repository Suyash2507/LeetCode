// https://leetcode.com/problems/insertion-sort-list

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
    public ListNode insertionSortList(ListNode head) {
        if(head==null)  return null;
        if(head.next==null) return new ListNode(head.val);
        ArrayList<Integer> al=new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        int[] t=new int[al.size()];
        for(int i=0;i<al.size();i++){
            t[i]=(int)al.get(i);
        }
        int[] finans= sort(t);
        ListNode temp=new ListNode(finans[0]);
        ListNode sol=temp;
        for(int j=1;j<finans.length;j++){
            temp.next= new ListNode(finans[j]);
            temp=temp.next;
        }
        return sol;
    }
    public int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}